package com.nature.design.pattern.decorate;

import com.nature.design.pattern.decorate.service.LotteryServiceImpl;
import org.junit.Test;

/**
 * @author nature
 * @date 2021/6/10 17:19
 */
public class DecorateTest {

    @Test
    public void test() {
        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        LotteryNumDecorate lotteryNumDecorate = new LotteryNumDecorate(lotteryService);
        LotteryTimeDecorate lotteryTimeDecorate = new LotteryTimeDecorate(lotteryNumDecorate);
        String result = lotteryTimeDecorate.doLottery("123");
        System.out.println(result);
    }
}
