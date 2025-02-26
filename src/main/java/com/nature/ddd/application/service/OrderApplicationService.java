package com.nature.ddd.application.service;

import com.nature.ddd.application.command.UpdateOrderCommand;

/**
 * @author Jayden Chau
 * @date 2025/2/26 11:54
 */
public interface OrderApplicationService {

    void updateOrder(Long id, UpdateOrderCommand command);
}
