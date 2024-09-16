package org.fai.study.demo_call_api.controller;

import org.fai.study.demo_call_api.controller.entities.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class OrderController {
    @GetMapping("/order")
    public Order GetOrder()
    {
        Order order = new Order("Ha noi", "CS1", "Nguyen A", "0988777", "1");

        return order;
    }
}
