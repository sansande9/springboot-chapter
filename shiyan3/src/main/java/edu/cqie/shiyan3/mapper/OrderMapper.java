package edu.cqie.shiyan3.mapper;

import edu.cqie.shiyan3.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    @Insert("insert into t_order(order_no,price,customer_id) values (#{orderNo},#{price},#{customerId})")
    int insertOrdder(Order order);


}
