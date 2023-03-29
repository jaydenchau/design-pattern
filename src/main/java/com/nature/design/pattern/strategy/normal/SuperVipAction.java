package com.nature.design.pattern.strategy.normal;

/**
 * @author nature
 * @date 2021/6/10 17:15
 */
public class SuperVipAction implements RoleAction {

    @Override
    public void sendWelcomeWord() {
        System.out.println("欢迎尊贵的超级vip");
    }
}
