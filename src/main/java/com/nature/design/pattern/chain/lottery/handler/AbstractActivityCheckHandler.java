package com.nature.design.pattern.chain.lottery.handler;

import com.nature.design.pattern.chain.lottery.Activity;
import com.nature.design.pattern.chain.lottery.ActivityCheckConfig;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Jayden Chau
 * @date 2023/2/23 15:02
 */
public abstract class AbstractActivityCheckHandler {

    public abstract boolean doCheck(Activity activity);

    /**
     * 每个处理节点对象包含下一个节点
     */
    @Getter
    @Setter
    protected AbstractActivityCheckHandler nextHandler;

    /**
     * 当前节点的配置（超时时间，降级配置等）
     */
    @Getter
    @Setter
    protected ActivityCheckConfig config;

    protected boolean next(Activity activity) {
        // 到达最后一个链路
        if (this.nextHandler == null) {
            return true;
        }
        return nextHandler.doCheck(activity);
    }


}
