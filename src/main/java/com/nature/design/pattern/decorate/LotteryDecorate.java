package com.nature.design.pattern.decorate;

import com.nature.design.pattern.decorate.service.LotteryService;

/**
 * @author nature
 * @date 2021/7/2 23:27
 */
public abstract class LotteryDecorate implements LotteryService {

    private final LotteryService lotteryService;

    public LotteryDecorate(LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    @Override
    public String doLottery(String guid) {
        return lotteryService.doLottery(guid);
    }
}
