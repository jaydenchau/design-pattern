package com.nature.design.pattern.strategy.spring;

import org.springframework.stereotype.Component;

/**
 * @author Jayden Chau
 * @date 2021/11/8 22:58
 */
@Component
public class DefaultUserService implements IRoleStrategy {

    @Override
    public String getUserType() {
        return "user";
    }

    @Override
    public void sendWelcomeWord() {
        System.out.println("欢迎你，白嫖怪");
    }
}
