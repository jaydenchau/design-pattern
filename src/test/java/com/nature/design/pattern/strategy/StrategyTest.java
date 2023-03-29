package com.nature.design.pattern.strategy;

import com.nature.design.pattern.strategy.normal.RoleContext;
import org.junit.Test;

import java.time.LocalDateTime;

/**
 * @author nature
 * @date 2021/6/10 17:19
 */
public class StrategyTest {

    @Test
    public void test() {
        RoleContext roleContext = new RoleContext(12321);
        roleContext.sendWelcomeWord();
    }

    @Test
    public void tt() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
