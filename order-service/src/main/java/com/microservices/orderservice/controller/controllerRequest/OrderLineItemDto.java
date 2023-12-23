package com.microservices.orderservice.controller.controllerRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemDto {

    private String skyunCode;
    private double price;
    private int quanity;
}
