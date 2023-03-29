package com.nature.design.pattern.bridge;

import java.math.BigDecimal;

/**
 * @author nature
 * @date 2021/3/25 16:48
 */
public abstract class Pay {

    protected PayMode payMode;

    protected Pay(PayMode payMode) {
        this.payMode = payMode;
    }

    public abstract void transfer(String userId, BigDecimal amount);
}
