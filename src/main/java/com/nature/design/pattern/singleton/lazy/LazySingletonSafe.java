package com.nature.design.pattern.singleton.lazy;

/**
 * 懒汉单例模式（线程安全）
 * 在使用时才加载对象
 *
 * @author nature
 * @date 2020/10/16 10:56
 */
public class LazySingletonSafe {

    /**
     * 私有构造方法避免类被外部实例化
     */
    public LazySingletonSafe() {
    }

    /**
     * 使用内部类
     * 当且仅当内部类的静态域或其构造方法或其静态方法被调用时，内部类才被加载
     */
    private static class SingletonHolder {
        private static final LazySingletonSafe INSTANCE = new LazySingletonSafe();
    }

    public static LazySingletonSafe getInstance() {
        return Holder.getInstance();
    }

    public void getName() {
        System.out.println("我是懒汉（线程安全）.");
    }
}
