package edu.cqie.springthymeleaf.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-04-07 20:32:42
 */
@Data
@ToString
@TableName("user")
public class User {

    private String username;

    private String password;

    private Integer age;

    private Integer sex;

    private Date birthDate;

}

