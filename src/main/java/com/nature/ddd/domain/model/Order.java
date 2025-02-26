package com.nature.ddd.domain.model;

import com.nature.ddd.domain.valueobjects.Address;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Jayden Chau
 * @date 2025/2/25 11:45
 */
@Getter
@Setter
public class Order {

    private Long id;

    private Address shippingAddress;

    private List<OrderItem> items;

    private BigDecimal totalAmount;

    private LocalDateTime createTime;

    // protected Order() {}

}
