package com.bettingground.product.domain.repository;

import com.bettingground.product.domain.entity.*;
import org.springframework.data.jpa.repository.*;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
