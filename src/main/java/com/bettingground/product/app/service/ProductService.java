package com.bettingground.product.app.service;

import com.bettingground.product.app.dto.*;
import com.bettingground.product.app.dto.ProductDto.*;
import com.bettingground.product.domain.entity.*;
import com.bettingground.product.domain.service.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductStore productStore;

    public String register(RegisterCommand command) {
        Product initProduct = command.toEntity();
        Product product = productStore.store(initProduct);
        return product.getProductToken();
    }

}
