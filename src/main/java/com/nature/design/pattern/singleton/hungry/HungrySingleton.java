package com.nature.design.pattern.singleton.hungry;

/**
 * 饿汉单例模式（线程安全）
 * 类在加载时就初始化一个实例
 *
 * @author nature
 * @date 2020/10/16 11:00
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void getName() {
        System.out.println("我是饿汉.");
    }
}
