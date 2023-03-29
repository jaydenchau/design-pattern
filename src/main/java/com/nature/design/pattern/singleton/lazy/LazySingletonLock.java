package com.nature.design.pattern.singleton.lazy;

/**
 * 懒汉单例模式（线程不安全）
 * 在使用时才加载对象
 *
 * @author nature
 * @date 2020/10/16 10:56
 */
public class LazySingletonLock {

    private static volatile LazySingletonLock instance;

    /**
     * 私有构造方法避免类被外部实例化
     */
    private LazySingletonLock() {

    }

    public static LazySingletonLock getInstance() {
        if (instance == null) {
            synchronized (LazySingletonLock.class) {
                instance = new LazySingletonLock();
            }
        }
        return instance;
    }

    public void getName() {
        System.out.println("我是懒汉（DCL）.");
    }
}
