package com.microservice.inventoryservice;

import com.microservice.inventoryservice.entities.Inventory;
import com.microservice.inventoryservice.repository.InventoryRepository;
import com.microservice.inventoryservice.services.InventoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryService) {
        return args -> {
         Inventory inv1 = Inventory.builder()
                .skuCode("iphone_13")
                .quantity(100)

                .build();
            Inventory inv2 = Inventory.builder()
                    .skuCode("iphone_14")
                    .quantity(0)

                    .build();
            inventoryService.save(inv1);
            inventoryService.save(inv2);

    };}
    }


