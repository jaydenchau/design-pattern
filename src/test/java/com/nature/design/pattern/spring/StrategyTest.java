package com.nature.design.pattern.spring;

import com.nature.design.pattern.strategy.spring.RoleStrategyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Jayden Chau
 * @date 2021/11/8 23:09
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StrategyTest {

    @Autowired
    private RoleStrategyService roleStrategyService;

    @Test
    public void testStrategy() {
        roleStrategyService.sendWelcomeWord("user");
    }
}
