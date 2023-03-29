package com.nature.design.pattern.decorate;

import com.nature.design.pattern.decorate.service.LotteryService;

/**
 * @author nature
 * @date 2021/7/3 00:25
 */
public class LotteryTimeDecorate extends LotteryDecorate {

    public LotteryTimeDecorate(LotteryService lotteryService) {
        super(lotteryService);
    }

    @Override
    public String doLottery(String guid) {
        this.judgeTime();
        String result = super.doLottery(guid);
        System.out.println("活动已结束");
        return result;
    }

    private void judgeTime() {
        System.out.println("当前活动未过期，可正常使用");
    }
}
