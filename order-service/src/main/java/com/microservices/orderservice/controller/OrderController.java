package com.microservices.orderservice.controller;


import com.microservices.orderservice.controller.controllerRequest.OrderRequest;
import com.microservices.orderservice.entities.Order;
import com.microservices.orderservice.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addOrder(@RequestBody OrderRequest req){
        orderService.addOrder(req);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Order> allOrder(){
        return orderService.allOrder();

    }
}
