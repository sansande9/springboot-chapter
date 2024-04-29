package edu.cqie.chapter2.entity;

import java.io.Serializable;

/**
 * (TArticle)实体类
 *
 * @author makejava
 * @since 2024-03-21 11:19:17
 */
public class TArticle implements Serializable {
    private static final long serialVersionUID = -28517978462724438L;
/**
     * 文章id
     */
    private Integer id;
/**
     * 文章标题
     */
    private String title;
/**
     * 文章内容
     */
    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

