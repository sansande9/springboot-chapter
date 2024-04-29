package edu.cqie.springthymeleaf.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("t_comment")
public class Comment {
    private int id;
    private String content;
    private String author;
    private String date;
}
