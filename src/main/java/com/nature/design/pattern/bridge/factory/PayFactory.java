package com.nature.design.pattern.bridge.factory;

import com.nature.design.pattern.bridge.*;

/**
 * @author nature
 * @date 2021/3/25 18:13
 */
public class PayFactory {

    public Pay getPayChannel(Integer payChannel, Integer payMode) {
        if (1 == payChannel) {
            PayMode paymode = null;
            switch (payMode) {
                case 1:
                    paymode = new PayFaceMode();
                    break;
                case 2:
                    paymode = new PayFingerMode();
                    break;
            }
            return new WeChatPay(paymode);
        }
        if (2 == payChannel) {
            PayMode paymode = null;
            switch (payMode) {
                case 1:
                    paymode = new PayFaceMode();
                    break;
                case 2:
                    paymode = new PayFingerMode();
                    break;
            }
            return new AliPay(paymode);
        }
        return null;
    }
}
