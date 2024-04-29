package edu.cqie.shiyan3.mapper;

import edu.cqie.shiyan3.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    @Insert("insert into t_customer(username,job,phone,sex) values (#{username},#{job},#{phone},#{sex}) ")
    int insertCustomer(Customer customer);


    int selectAll(Customer customer);
}
