package com.nature.ddd.infra.repository;

import com.google.common.collect.Lists;
import com.nature.ddd.domain.detector.OrderItemChangeDetector;
import com.nature.ddd.domain.model.Order;
import com.nature.ddd.domain.model.OrderItem;
import com.nature.ddd.domain.repository.AbstractRepository;
import com.nature.ddd.domain.repository.OrderRepository;
import com.nature.ddd.domain.types.ChangeDetector;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Jayden Chau
 * @date 2025/2/26 11:47
 */
@Repository
public class OrderRepositoryImpl extends AbstractRepository<Order, Long> implements OrderRepository {

    @Override
    protected <E> List<E> loadOriginalState(Order aggregateRoot, ChangeDetector<Order, E, ?> detector) {
        if (detector instanceof OrderItemChangeDetector) {
            OrderItem orderItem = new OrderItem();
            orderItem.setId(1L);
            orderItem.setPrice(new BigDecimal(200));
            orderItem.setProductId("1");
            OrderItem orderItem2 = new OrderItem();
            orderItem2.setId(2L);
            orderItem2.setPrice(new BigDecimal(200));
            orderItem2.setProductId("22");
            return (List<E>) Lists.newArrayList(orderItem, orderItem2);
        }
        return null;
    }

    @Override
    protected <E> List<E> getCurrentState(Order aggregateRoot, ChangeDetector<Order, E, ?> detector) {
        if (detector instanceof OrderItemChangeDetector) {
            OrderItem orderItem = new OrderItem();
            orderItem.setId(1L);
            orderItem.setPrice(new BigDecimal(200));
            orderItem.setProductId("11");
            OrderItem orderItem3 = new OrderItem();
            orderItem3.setId(3L);
            orderItem3.setPrice(new BigDecimal(300));
            orderItem3.setProductId("33");
            return (List<E>) Lists.newArrayList(orderItem, orderItem3);
        }
        return null;
    }

    @Override
    protected <E> void handleAdded(Order aggregateRoot, List<E> added) {
        if (CollectionUtils.isNotEmpty(added) && added.get(0) instanceof OrderItem) {
            System.out.println("add order item");
        }
    }

    @Override
    protected <E> void handleModified(Order aggregateRoot, List<E> modified) {
        if (CollectionUtils.isNotEmpty(modified) && modified.get(0) instanceof OrderItem) {
            System.out.println("update order item");
        }
    }

    @Override
    protected <E> void handleRemoved(Order aggregateRoot, List<E> removed) {
        if (CollectionUtils.isNotEmpty(removed) && removed.get(0) instanceof OrderItem) {
            System.out.println("delete order item");
        }
    }

    @Override
    public void save(Order order) {
        processChanges(order);
    }
}
