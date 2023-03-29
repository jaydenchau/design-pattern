package com.nature.design.pattern.prototype;

import org.junit.Test;

/**
 * @author nature
 * @date 2020/10/16 16:09
 */
public class PrototypeTest {

    /**
     * 原型模式
     */
    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Student obj1 = new Student();
        Student obj2 = (Student) obj1.cloneObject();
        System.out.println("student == copy ? " + (obj1 == obj2));
    }

}
