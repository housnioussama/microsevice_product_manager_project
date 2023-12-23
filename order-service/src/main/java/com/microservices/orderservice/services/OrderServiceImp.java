package com.microservices.orderservice.services;

import com.microservices.orderservice.controller.controllerRequest.OrderLineItemDto;
import com.microservices.orderservice.controller.controllerRequest.OrderRequest;
import com.microservices.orderservice.entities.Order;
import com.microservices.orderservice.entities.OrderLineItem;
import com.microservices.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImp implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public void addOrder(OrderRequest o) {
    Order order= Order.builder()
            .ordersLineItemList(mapToOderLineItem(o.getOrdersLineItemList()))
            .ordernumber(o.getOrderNumber())
            .build();
    orderRepository.save(order);

    }

    private List<OrderLineItem> mapToOderLineItem(List<OrderLineItemDto> ordersLineItemList) {
        return ordersLineItemList.stream().map(line-> new OrderLineItem(null,line.getSkyunCode(),line.getPrice(),line.getQuanity())).toList();
    }

    @Override
    public List<Order> allOrder() {
        return orderRepository.findAll();
    }
}
