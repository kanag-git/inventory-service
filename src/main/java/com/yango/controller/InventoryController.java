package com.yango.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class InventoryController {
    private static final Random RANDOM = new Random();

    @GetMapping
    public String getInventory(){
        return String.valueOf(RANDOM.nextInt(1,100));
    }
}
