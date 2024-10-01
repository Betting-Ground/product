package com.bettingground.product.app.dto;

import com.bettingground.product.domain.entity.*;
import lombok.*;

public class ProductDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RegisterCommand {
        private String name;
        private Long price;
        private Long stock;

        public Product toEntity() {
            return Product.builder()
                    .name(this.name)
                    .price(this.price)
                    .stock(this.stock)
                    .build();
        }
    }

}
