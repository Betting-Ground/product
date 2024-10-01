package com.bettingground.product.domain.entity;

import com.bettingground.product._common.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "products")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Product extends BaseEntity {

    private static final String PRODUCT_TOKEN_PREFIX = "product_";

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "product_id")
    private Long id;
    private String productToken;
    private String name;
    private Long price;
    @Min(0)
    private Long stock;

    @Builder
    public Product(String name, Long price, Long stock) {
        this.productToken = TokenGenerator.randomCharacterWithPrefix(PRODUCT_TOKEN_PREFIX);
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
