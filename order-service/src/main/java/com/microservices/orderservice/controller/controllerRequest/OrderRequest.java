package com.microservices.orderservice.controller.controllerRequest;

import com.microservices.orderservice.entities.OrderLineItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor@AllArgsConstructor
public class OrderRequest {

    private String orderNumber;

    private List<OrderLineItemDto> ordersLineItemList;
}
