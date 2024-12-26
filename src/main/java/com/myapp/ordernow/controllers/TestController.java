package com.myapp.ordernow.controllers;

import com.myapp.ordernow.models.Order;
import com.myapp.ordernow.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan("com.myapp.ordernow.service")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/order/All")
    public List<Order> test() {
        return testService.findAllOrder();
    }

    @PostMapping("/order/save")
    public Order saveOrder(@RequestBody Order order) {
        return testService.saveOrder(order);
    }

    @GetMapping("/order/name")
    public Order findOrderByName(@PathVariable String name) {
        return testService.findOrderByName(name);
    }
}