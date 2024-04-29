package edu.cqie.shiyan4.mapper;

import edu.cqie.shiyan4.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
 @Select("select * from user where username=#{username}")
 User queryByname(String username);


}
