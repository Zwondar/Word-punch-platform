# Word-punch-platform 单词打卡平台

## 项目简介
这是一个基于Vue2和SpringBoot的单词打卡平台，支持自定义词库和AI辅助学习功能。平台可以内嵌大模型进行智能学习，并支持导入自定义词库进行专门化的单词打卡训练。

## 在线演示
- 访问地址：http://114.55.2.32:999/
## 功能特点
- [ ] 自定义词库导入
- [ ] AI智能学习辅助
- [ ] 单词打卡追踪
- [ ] 学习进度统计
- [ ] 个性化学习计划

## 界面预览
### 首页单词学习
![首页预览](https://math-rag.oss-cn-hangzhou.aliyuncs.com/vue_project%20%E5%92%8C%E5%8F%A6%E5%A4%96%201%20%E4%B8%AA%E9%A1%B5%E9%9D%A2%20-%20%E4%B8%AA%E4%BA%BA%20-%20Microsoft%E2%80%8B%20Edge%202025_5_7%2022_48_30.png)

### AI对话页面
![单词学习](https://math-rag.oss-cn-hangzhou.aliyuncs.com/vue_project%20%E5%92%8C%E5%8F%A6%E5%A4%96%201%20%E4%B8%AA%E9%A1%B5%E9%9D%A2%20-%20%E4%B8%AA%E4%BA%BA%20-%20Microsoft%E2%80%8B%20Edge%202025_5_7%2022_48_40.png)

### AI访问
![学习统计](https://math-rag.oss-cn-hangzhou.aliyuncs.com/vue_project%20%E5%92%8C%E5%8F%A6%E5%A4%96%201%20%E4%B8%AA%E9%A1%B5%E9%9D%A2%20-%20%E4%B8%AA%E4%BA%BA%20-%20Microsoft%E2%80%8B%20Edge%202025_5_7%2022_48_43.png)

## 技术栈
### 前端
- Vue 2.x
- HTML
- JavaScript
- Css

### 后端
- Spring Boot
- MySQL
- LangChain4j

## 快速开始

### 环境要求
- Node.js 
- JDK (21)
- MySQL (8.0)

### 前端启动
```bash
cd CardVue2
npm install
npm run serve
```

### 后端启动
1. 创建MySQL数据库
```sql
CREATE DATABASE cards;
```

2. 导入示例数据
- 项目中的`数智技术赋能乡村生态发展语料库(1).xlsx`文件提供了示例数据
- 需要将其转换为SQL文件并导入到cards数据库中

3. 配置数据库连接
- 修改`application.properties`或`application.yml`中的数据库连接信息
- 默认配置：
  - 数据库名：cards

4. 启动SpringBoot应用
```bash
cd cardJava
mvn spring-boot:run
```

## 配置说明

### 跨域配置
如需修改跨域配置，请编辑`WebConfig.java`文件，将IP地址修改为前端项目的运行地址。

### AI服务配置
1. 注册阿里云账号
2. 获取百炼API KEY
3. 在Services部分配置API KEY和相应地址

## 项目结构
```
Word-punch-platform/
├── CardVue2/          # 前端Vue2项目
├── cardJava/          # 后端SpringBoot项目
```
## 许可证
​​MIT​

## 联系方式
860579435@qq.com