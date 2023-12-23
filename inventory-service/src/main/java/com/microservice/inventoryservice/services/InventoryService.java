package com.microservice.inventoryservice.services;

public interface InventoryService {
    boolean isInStock(String skuCode);
}
