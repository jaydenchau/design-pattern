package com.nature.design.pattern.decorate.service;

/**
 * @author nature
 * @date 2021/7/2 23:27
 */
public class LotteryServiceImpl implements LotteryService {

    @Override
    public String doLottery(String guid) {
        return "当前未中奖";
    }
}
