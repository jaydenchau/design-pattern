package com.nature.design.pattern.singleton.lazy;

/**
 * 懒汉单例模式（线程不安全）
 * 在使用时才加载对象
 *
 * @author nature
 * @date 2020/10/16 10:56
 */
public class LazySingleton {

    private static LazySingleton instance;

    /**
     * 私有构造方法避免类被外部实例化
     */
    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
