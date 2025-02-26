package com.nature.ddd.domain.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Jayden Chau
 * @date 2025/2/25 11:45
 */
@Data
public class OrderItem {

    private Long Id;
    private String productId;
    private BigDecimal price;
    private Integer quantity;
}
