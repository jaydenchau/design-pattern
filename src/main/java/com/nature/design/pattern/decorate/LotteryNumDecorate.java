package com.nature.design.pattern.decorate;

import com.nature.design.pattern.decorate.service.LotteryService;

/**
 * @author nature
 * @date 2021/7/2 23:31
 */
public class LotteryNumDecorate extends LotteryDecorate {

    public LotteryNumDecorate(LotteryService lotteryService) {
        super(lotteryService);
    }

    @Override
    public String doLottery(String guid) {
        this.judgeJoinPeopleNum();
        return super.doLottery(guid);
    }

    private void judgeJoinPeopleNum() {
        System.out.println("判断活动参与人数是否超出限制");
    }
}
