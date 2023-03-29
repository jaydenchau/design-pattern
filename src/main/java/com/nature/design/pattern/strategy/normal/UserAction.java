package com.nature.design.pattern.strategy.normal;

/**
 * @author nature
 * @date 2021/6/10 17:16
 */
public class UserAction implements RoleAction {

    @Override
    public void sendWelcomeWord() {
        System.out.println("欢迎你，白嫖怪");
    }
}
