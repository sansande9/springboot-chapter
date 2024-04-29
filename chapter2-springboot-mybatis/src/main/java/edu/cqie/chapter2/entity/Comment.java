package edu.cqie.chapter2.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Comment {
    private int id;
    private String content;
    private String author;
    private Integer aId;
}
