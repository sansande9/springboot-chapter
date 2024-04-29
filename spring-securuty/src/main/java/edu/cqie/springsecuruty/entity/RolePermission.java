package edu.cqie.springsecuruty.entity;

import java.io.Serializable;

/**
 * (RolePermission)实体类
 *
 * @author makejava
 * @since 2024-04-22 12:11:15
 */
public class RolePermission implements Serializable {
    private static final long serialVersionUID = 615569058738663499L;

    private Integer id;

    private Integer rid;

    private Integer mid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

}

