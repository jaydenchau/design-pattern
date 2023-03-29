package com.nature.design.pattern.singleton;

import com.nature.design.pattern.singleton.hungry.HungrySingleton;
import com.nature.design.pattern.singleton.lazy.LazySingletonSafe;
import org.junit.Test;

/**
 * @author nature
 * @date 2020/10/16 16:09
 */
public class SingletonTest {


    /**
     * 懒汉单例
     */
    @Test
    public void testLazeSingleton() {
        LazySingletonSafe instance1 = LazySingletonSafe.getInstance();
        instance1.getName();
        LazySingletonSafe instance2 = LazySingletonSafe.getInstance();
        instance2.getName();
        // 生成的是同一个对象，返回true
        System.out.println(instance1 == instance2);
    }

    /**
     * 饿汉单例
     */
    @Test
    public void testHungrySingleton() {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        instance1.getName();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        instance2.getName();
        System.out.println(instance1 == instance2);
    }

    /**
     * 饿汉单例
     */
    @Test
    public void testDclSingleton() {
        String aa = "aa" + "-" + System.currentTimeMillis();
        System.out.println(aa);
    }
}
