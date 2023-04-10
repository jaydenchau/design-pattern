package com.nature.design.pattern.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * 原型模式
 *
 * @author nature
 * @date 2020/10/16 16:28
 */
@Getter
@Setter
public class Student implements Cloneable {

    private String name;

    public Object cloneObject() throws CloneNotSupportedException {
        System.out.println("复制成功！");
        return super.clone();
    }

}
