package com.bettingground.product.domain.entity;

import jakarta.persistence.*;
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
    private Long stock;

}
