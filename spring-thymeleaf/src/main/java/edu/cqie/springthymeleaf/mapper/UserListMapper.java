package edu.cqie.springthymeleaf.mapper;

import edu.cqie.springthymeleaf.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserListMapper {
    @Select("select * from user")
    List<User> getUserList();
}
