package com.bettingground.product.infra;

import com.bettingground.product.domain.entity.*;
import com.bettingground.product.domain.repository.*;
import com.bettingground.product.domain.service.*;
import lombok.*;
import org.springframework.stereotype.*;

@Component
@RequiredArgsConstructor
public class ProductStoreImpl implements ProductStore {

    private final ProductRepository productRepository;

    @Override
    public Product store(Product initProduct) {
        return productRepository.save(initProduct);
    }
}
