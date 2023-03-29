package com.nature.design.pattern.chain.lottery;

import lombok.Data;

/**
 * @author Jayden Chau
 * @date 2023/2/23 15:11
 */
@Data
public class ActivityCheckConfig {

    /**
     * 当前处理器的bean名称
     */
    private String handler;

    /**
     * 下一个处理器
     */
    private ActivityCheckConfig next;

    /**
     * 是否降级
     */
    private Boolean down = Boolean.FALSE;
}
