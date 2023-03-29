package com.nature.design.pattern.factory.method;

/**
 * @author nature
 * @date 2020/10/23 10:41
 */
public class ShoesProduct implements Product {

    @Override
    public void buildProduct() {
        System.out.println("我生产的是鞋子。。");
    }
}
