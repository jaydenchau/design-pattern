package com.nature.design.pattern.builder;

import org.junit.Test;

/**
 * @author nature
 * @date 2020/10/16 16:09
 */
public class BuilderTest {

    /**
     * 建造者模式
     */
    @Test
    public void testBuilder() {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }

}
