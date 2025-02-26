package com.nature.ddd.domain.repository;

import com.nature.ddd.domain.model.Order;

/**
 * @author Jayden Chau
 * @date 2025/2/26 11:47
 */
public interface OrderRepository {

    void save(Order order);
}
