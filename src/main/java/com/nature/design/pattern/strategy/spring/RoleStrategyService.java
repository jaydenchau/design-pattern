package com.nature.design.pattern.strategy.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jayden Chau
 * @date 2021/11/8 23:01
 */
@Component
public class RoleStrategyService implements ApplicationContextAware {

    private final Map<String, IRoleStrategy> roleStrategyMap = new HashMap<>();

    public void sendWelcomeWord(String userType) {
        IRoleStrategy iRoleStrategy = roleStrategyMap.get(userType);
        if (iRoleStrategy != null) {
            iRoleStrategy.sendWelcomeWord();
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, IRoleStrategy> beansOfType = applicationContext.getBeansOfType(IRoleStrategy.class);
        Collection<IRoleStrategy> values = beansOfType.values();
        for (IRoleStrategy userStrategyService : values) {
            roleStrategyMap.put(userStrategyService.getUserType(), userStrategyService);
        }
    }
}
