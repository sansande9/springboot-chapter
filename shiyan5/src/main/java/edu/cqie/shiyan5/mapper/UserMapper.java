package edu.cqie.shiyan5.mapper;

import edu.cqie.shiyan5.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
* @author wenzhi gao
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-04-29 11:03:36
* @Entity edu.cqie.shiyan5.entity.User
*/
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where username = #{username}")
    User selectByUsername(String username);
}




