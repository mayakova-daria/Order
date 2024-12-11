package com.example.ordersmanagement.controller;

import com.example.ordersmanagement.model.Order;
import com.example.ordersmanagement.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository = new OrderRepository();

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderRepository.getOrderById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @PostMapping
    public void addOrder(@RequestBody Order order) {
        orderRepository.addOrder(order);
    }
}
