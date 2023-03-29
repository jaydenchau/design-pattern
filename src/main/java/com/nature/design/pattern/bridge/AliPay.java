package com.nature.design.pattern.bridge;

import java.math.BigDecimal;

/**
 * @author nature
 * @date 2021/3/25 16:57
 */
public class AliPay extends Pay {

    public AliPay(PayMode payMode) {
        super(payMode);
    }

    @Override
    public void transfer(String userId, BigDecimal amount) {
        System.out.println("支付宝转账开始。。。。");
        boolean security = payMode.security(userId);
        if (security) {
            System.out.println("向用户:" + userId + "转账结束");
        }
    }
}
