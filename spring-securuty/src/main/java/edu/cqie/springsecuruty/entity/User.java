package edu.cqie.springsecuruty.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-04-22 12:11:27
 */
public class User implements Serializable {
    private static final long serialVersionUID = 748606487724418488L;

    private Integer uid;

    private String username;

    private String password;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

