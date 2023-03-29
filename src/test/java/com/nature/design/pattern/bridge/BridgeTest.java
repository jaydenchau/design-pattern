package com.nature.design.pattern.bridge;

import com.nature.design.pattern.bridge.factory.PayFactory;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author nature
 * @date 2021/3/25 16:58
 */
public class BridgeTest {

    @Test
    public void test() {
        // Pay pay1 = new WeChatPay(new PayFaceMode());
        // System.out.println("调起微信人脸支付。。。");
        // pay1.transfer("10001", new BigDecimal("100"));
        // System.out.println("--------------------------------------------");
        //
        // Pay pay2 = new WeChatPay(new PayFingerMode());
        // System.out.println("调起微信指纹支付。。。");
        // pay2.transfer("10002", new BigDecimal("100"));
        // System.out.println("--------------------------------------------");
        //
        // Pay pay3 = new AliPay(new PayFingerMode());
        // System.out.println("调起支付宝指纹支付。。。");
        // pay3.transfer("10003", new BigDecimal("100"));
        // System.out.println("--------------------------------------------");
        //
        // Pay pay4 = new AliPay(new PayFaceMode());
        // System.out.println("调起支付宝人脸支付。。。");
        // pay4.transfer("10004", new BigDecimal("100"));
        // System.out.println("--------------------------------------------");

        PayFactory payFactory = new PayFactory();
        Pay payChannel = payFactory.getPayChannel(1, 2);
        payChannel.transfer("10003", new BigDecimal("100"));

    }
}
