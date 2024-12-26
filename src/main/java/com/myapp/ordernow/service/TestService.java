package com.myapp.ordernow.service;

import com.myapp.ordernow.models.Order;
import com.myapp.ordernow.repositories.OrderTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ComponentScan("com.myapp.ordernow.repositories")
public class TestService {
    private OrderTestRepository orderTestRepository;

    @Autowired
    public TestService(OrderTestRepository orderTestRepository) {
        this.orderTestRepository = orderTestRepository;
    }

    public Order saveOrder(Order order) {
        return orderTestRepository.save(order);
    }

    public Order findOrderByName(String name) {
        return orderTestRepository.findByName(name);
    }

    public List<Order> findAllOrder(){
        return orderTestRepository.findAll();
    }
}
