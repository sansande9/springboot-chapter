package edu.cqie.shiyan3.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TOrder)实体类
 *
 * @author 高文志
 * @since 2024-03-25 11:12:15
 */
@Data
public class Order {
    private Integer id;

    private String orderNo;

    private String price;

    private Integer customerId;

}

