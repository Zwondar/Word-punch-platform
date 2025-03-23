package person.card.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import person.card.Servive.Words;
@Mapper
public interface UserMap {
    @Select("select english_term,chinese_translation from terms where id=#{random}")
    Words getWord(int random);//随机查询单词和翻译


}
