package com.nature.ddd.api;

import com.nature.ddd.application.service.OrderApplicationService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jayden Chau
 * @date 2025/2/26 13:37
 */
@RestController
public class OrderController {

    private final OrderApplicationService orderApplicationService;

    public OrderController(OrderApplicationService orderApplicationService) {
        this.orderApplicationService = orderApplicationService;
    }

    @PutMapping("/order")
    public void saveOrder() {
        orderApplicationService.updateOrder(1L, null);
    }

}
