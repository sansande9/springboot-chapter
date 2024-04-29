package edu.cqie.springsecuruty.entity;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2024-04-22 12:11:38
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = -12511044709256829L;

    private Integer id;

    private Integer uid;

    private Integer rid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

}

