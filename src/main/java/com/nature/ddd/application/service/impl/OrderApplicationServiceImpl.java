package com.nature.ddd.application.service.impl;

import com.nature.ddd.application.command.UpdateOrderCommand;
import com.nature.ddd.application.service.OrderApplicationService;
import com.nature.ddd.domain.model.Order;
import com.nature.ddd.domain.repository.OrderRepository;
import org.springframework.stereotype.Service;

/**
 * @author Jayden Chau
 * @date 2025/2/26 11:54
 */
@Service
public class OrderApplicationServiceImpl implements OrderApplicationService {

    private final OrderRepository orderRepository;

    public OrderApplicationServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void updateOrder(Long id, UpdateOrderCommand command) {
        Order order = new Order();
        orderRepository.save(order);

    }
}
