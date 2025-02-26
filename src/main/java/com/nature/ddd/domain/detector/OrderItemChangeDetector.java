package com.nature.ddd.domain.detector;

import com.nature.ddd.domain.model.Order;
import com.nature.ddd.domain.model.OrderItem;
import com.nature.ddd.domain.types.AbstractChangeDetector;
import org.springframework.stereotype.Component;

/**
 * @author Jayden Chau
 * @date 2025/2/26 11:37
 */
@Component
public class OrderItemChangeDetector extends AbstractChangeDetector<Order, OrderItem, Long> {

    @Override
    protected Long extractId(OrderItem entity) {
        return entity.getId();
    }

    @Override
    protected boolean isSameBusinessContent(Order aggregateRoot, OrderItem origin, OrderItem current) {
        return origin.getProductId().equals(current.getProductId())
                && origin.getPrice().compareTo(current.getPrice()) == 0
                && origin.getQuantity().equals(current.getQuantity());
    }
}
