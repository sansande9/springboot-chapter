package edu.cqie.shiyan4.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-04-15 11:41:41
 */
@Data
@ToString
public class User {

    private String username;

    private String password;

    private Integer age;

    private Integer sex;

    private Date birthDate;

    private String role;



}

