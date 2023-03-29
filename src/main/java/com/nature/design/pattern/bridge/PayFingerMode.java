package com.nature.design.pattern.bridge;

/**
 * @author nature
 * @date 2021/3/25 16:52
 */
public class PayFingerMode implements PayMode {

    @Override
    public boolean security(String userId) {
        System.out.println("进行指纹支付");
        return true;
    }
}
