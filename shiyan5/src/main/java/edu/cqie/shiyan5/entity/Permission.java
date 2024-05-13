package edu.cqie.shiyan5.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName permission
 */
@TableName(value ="permission")
@Data
public class Permission implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer mid;

    /**
     * 
     */
    private String menuname;

    /**
     * 
     */
    private String url;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}