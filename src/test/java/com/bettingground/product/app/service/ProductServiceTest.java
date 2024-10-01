package com.bettingground.product.app.service;

import com.bettingground.product.app.dto.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    public void register() throws Exception {
        // given
        ProductDto.RegisterCommand command = new ProductDto.RegisterCommand("iPhone", 10000L, 3L);

        // when
        String productToken = productService.register(command);

        // then
        System.out.println("productToken = " + productToken);
    }

}