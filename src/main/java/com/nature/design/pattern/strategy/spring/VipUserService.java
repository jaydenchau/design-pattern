package com.nature.design.pattern.strategy.spring;

import org.springframework.stereotype.Component;

/**
 * @author Jayden Chau
 * @date 2021/11/8 22:59
 */
@Component
public class VipUserService implements IRoleStrategy {

    @Override
    public String getUserType() {
        return "vip";
    }

    @Override
    public void sendWelcomeWord() {
        System.out.println("欢迎你，尊贵的vip用户");
    }
}
