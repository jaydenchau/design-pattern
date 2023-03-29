package com.nature.design.pattern.chain.lottery.handler;

import com.nature.design.pattern.chain.lottery.Activity;
import org.springframework.stereotype.Component;

/**
 * @author Jayden Chau
 * @date 2023/2/23 15:17
 */
@Component
public class ActivityExpiredCheckHandler extends AbstractActivityCheckHandler {

    @Override
    public boolean doCheck(Activity activity) {
        System.out.println("校验活动是否过期。。。。");
        // 降级校验
        if (super.getConfig().getDown()) {
            System.out.println("空值校验 Handler 已降级，跳过空值校验 Handler...");
            return super.next(activity);
        }
        if (activity.isExpired()) {
            return false;
        }
        System.out.println("活动过期校验通过。。。。");
        return super.next(activity);
    }
}
