package com.nature.design.pattern.chain.lottery.handler;

import com.nature.design.pattern.chain.lottery.Activity;
import org.springframework.stereotype.Component;

/**
 * @author Jayden Chau
 * @date 2023/2/23 15:18
 */
@Component
public class ActivityAwardCheckHandler extends AbstractActivityCheckHandler {

    @Override
    public boolean doCheck(Activity activity) {
        System.out.println("校验活动是否富余。。。。");
        // 降级校验
        if (super.getConfig().getDown()) {
            System.out.println("空值校验 Handler 已降级，跳过空值校验 Handler...");
            return super.next(activity);
        }
        if (activity.getAwardRemainNum() <= 0) {
            return false;
        }
        System.out.println("活动富余校验通过。。。。");
        return super.next(activity);
    }
}
