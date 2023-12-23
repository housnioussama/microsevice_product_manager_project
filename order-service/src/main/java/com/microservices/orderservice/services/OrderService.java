package com.microservices.orderservice.services;

import com.microservices.orderservice.controller.controllerRequest.OrderRequest;
import com.microservices.orderservice.entities.Order;
import java.util.List;

public interface OrderService {
    void addOrder(OrderRequest o);
    List<Order> allOrder();
}
