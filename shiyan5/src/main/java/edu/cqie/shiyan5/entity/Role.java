package edu.cqie.shiyan5.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName role
 */
@TableName(value ="role")
@Data
public class Role implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer rid;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String namechinese;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}