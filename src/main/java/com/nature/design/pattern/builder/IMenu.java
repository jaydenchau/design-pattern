package com.nature.design.pattern.builder;

/**
 * 包装接口（承载物料料和创建者中间衔接）
 *
 * @author nature
 * @date 2020/10/23 15:40
 */
public interface IMenu {

    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
