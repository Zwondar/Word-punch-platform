package person.card.Servive;

import com.alibaba.dashscope.aigc.generation.Generation;
import com.alibaba.dashscope.aigc.generation.GenerationParam;
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.common.Message;
import com.alibaba.dashscope.common.Role;
import com.alibaba.dashscope.exception.ApiException;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import com.alibaba.dashscope.utils.JsonUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class AlibabaService {
    public static GenerationResult callWithMessage(String message) throws ApiException, NoApiKeyException, InputRequiredException {
        Generation gen = new Generation();
        Message systemMsg = Message.builder()
                .role(Role.SYSTEM.getValue())
                .content("你是一个科普助手,你的名字叫小I，你是周盛希开发的，尽量用专业词汇回答用户")
                .build();
        Message userMsg = Message.builder()
                .role(Role.USER.getValue())
                .content(message)
                .build();
        GenerationParam param = GenerationParam.builder()
                // 若没有配置环境变量，请用百炼API Key将下行替换为：.apiKey("sk-xxx")
                .apiKey("")// 此处填写自己的APIKEY
                // 此处以qwen-plus为例，可按需更换模型名称。模型列表：https://help.aliyun.com/zh/model-studio/getting-started/models
                .model("qwen-turbo-latest")
                .messages(Arrays.asList(systemMsg, userMsg))
                .resultFormat(GenerationParam.ResultFormat.MESSAGE)
                .build();
        return gen.call(param);
    }

    public String getMeg(String meg)
    {
        String res = null;
        try {
            GenerationResult result = callWithMessage(meg);
            String jsonStr= JsonUtils.toJson(result);
            JSONObject jsonObject = JSON.parseObject(jsonStr);

            // 提取 content 字段
           res = jsonObject
                    .getJSONObject("output") // 获取 output 对象
                    .getJSONArray("choices") // 获取 choices 数组
                    .getJSONObject(0) // 获取第一个 choice 对象
                    .getJSONObject("message") // 获取 message 对象
                    .getString("content"); // 获取 content 字段
        } catch (ApiException | NoApiKeyException | InputRequiredException e) {
            // 使用日志框架记录异常信息
            System.err.println("An error occurred while calling the generation service: " + e.getMessage());
        }
        return res;
    }
}