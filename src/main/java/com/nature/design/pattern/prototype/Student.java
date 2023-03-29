package com.nature.design.pattern.prototype;

/**
 * 原型模式
 *
 * @author nature
 * @date 2020/10/16 16:28
 */
public class Student implements Cloneable {

    public Object cloneObject() throws CloneNotSupportedException {
        System.out.println("复制成功！");
        return super.clone();
    }

}
