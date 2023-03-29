package com.nature.design.pattern.chain;

import com.nature.design.pattern.chain.lottery.ActivityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Jayden Chau
 * @date 2023/2/23 15:38
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ChainTest {

    @Resource
    private ActivityService activityService;

    @Test
    public void testActivity() throws Exception {
        boolean result = activityService.doActivityHandler();
        System.out.println("活动校验结果 ： " + result);
    }
}
