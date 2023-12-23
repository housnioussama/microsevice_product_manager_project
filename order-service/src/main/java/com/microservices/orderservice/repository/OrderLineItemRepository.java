package com.microservices.orderservice.repository;

import com.microservices.orderservice.entities.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemRepository extends JpaRepository<OrderLineItem,Long> {
}
