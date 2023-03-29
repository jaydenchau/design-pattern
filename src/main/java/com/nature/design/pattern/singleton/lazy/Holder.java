package com.nature.design.pattern.singleton.lazy;

/**
 * @author nature
 * @date 2021/7/8 00:54
 */
public class Holder {

    public static LazySingletonSafe instance = new LazySingletonSafe();

    public static LazySingletonSafe getInstance() {
        return instance;
    }
}
