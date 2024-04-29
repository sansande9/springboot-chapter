package edu.cqie.shiyan3.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TCustomer)实体类
 *
 * @author 高文志
 * @since 2024-03-25 11:11:59
 */
@Data
public class Customer{

    private Integer id;

    private String username;

    private String job;

    private String phone;

    private Integer sex;
}

