package edu.cqie.springsecuruty.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2024-04-22 12:11:06
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 329829616987901677L;

    private Integer rid;

    private String name;

    private String namechinese;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamechinese() {
        return namechinese;
    }

    public void setNamechinese(String namechinese) {
        this.namechinese = namechinese;
    }

}

