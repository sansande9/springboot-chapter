package edu.cqie.springsecuruty.entity;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2024-04-22 12:10:53
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = -76932528557809507L;

    private Integer mid;

    private String menuname;

    private String url;


    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

