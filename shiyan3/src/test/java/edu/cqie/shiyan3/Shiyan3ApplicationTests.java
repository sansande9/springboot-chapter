package edu.cqie.shiyan3;

import edu.cqie.shiyan3.entity.Customer;
import edu.cqie.shiyan3.entity.Order;
import edu.cqie.shiyan3.mapper.CustomerMapper;
import edu.cqie.shiyan3.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Shiyan3ApplicationTests {
@Autowired
private CustomerMapper customerMapper;
@Autowired
private OrderMapper orderMapper;
    @Test
    void insertCustomer() {
        Customer customer = new Customer();
        customer.setUsername("张三");
        customer.setJob("程序员");
        customer.setPhone("18575454152");
        customer.setSex(1);
        Customer customer1 = new Customer();
        customer1.setUsername("王五");
        customer1.setJob("程序员");
        customer1.setPhone("18575454155");
        customer1.setSex(1);
        Customer customer2 = new Customer();
        customer2.setUsername("张利");
        customer2.setJob("架构师");
        customer2.setPhone("18575454133");
        customer2.setSex(0);
        customerMapper.insertCustomer(customer);
        customerMapper.insertCustomer(customer1);
        customerMapper.insertCustomer(customer2);

    }

    @Test
    public void insertOrder(){
        Order order = new Order();
        order.setOrderNo("10001");
        order.setPrice("125");
        order.setCustomerId(1);
        Order order1 = new Order();
        order1.setOrderNo("10002");
        order1.setPrice("251");
        order1.setCustomerId(1);
        Order order2 = new Order();
        order2.setOrderNo("10003");
        order2.setPrice("785");
        order2.setCustomerId(2);
        orderMapper.insertOrdder(order);
        orderMapper.insertOrdder(order1);
        orderMapper.insertOrdder(order2);
    }

}
