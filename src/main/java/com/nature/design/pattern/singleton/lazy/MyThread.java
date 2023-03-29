package com.nature.design.pattern.singleton.lazy;

/**
 * @author nature
 * @date 2021/7/8 00:31
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(LazySingletonLock.getInstance().hashCode());
    }
}
