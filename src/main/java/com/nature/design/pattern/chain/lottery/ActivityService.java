package com.nature.design.pattern.chain.lottery;

import com.alibaba.fastjson.JSON;
import com.nature.design.pattern.chain.lottery.handler.AbstractActivityCheckHandler;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Objects;

/**
 * @author Jayden Chau
 * @date 2023/2/23 15:06
 */
@Service
public class ActivityService {

    @Resource
    private Map<String, AbstractActivityCheckHandler> handlerMap;

    public boolean doActivityHandler() throws Exception {
        // 获取设置
        ActivityCheckConfig activityConfig = this.getActivityConfig();
        // 获取执行对象
        AbstractActivityCheckHandler handler = this.getHandler(activityConfig);
        if (handler == null) {
            throw new Exception("活动设置有误");
        }
        return handler.doCheck(this.queryActivity());
    }

    private AbstractActivityCheckHandler getHandler(ActivityCheckConfig config) {
        // 没有配置链路
        if (Objects.isNull(config)) {
            return null;
        }
        //配置错误
        if (StringUtils.isBlank(config.getHandler())) {
            return null;
        }
        // 配置了错误的链路
        AbstractActivityCheckHandler abstractActivityCheckHandler = handlerMap.get(config.getHandler());
        if (Objects.isNull(abstractActivityCheckHandler)) {
            return null;
        }
        abstractActivityCheckHandler.setConfig(config);
        //递归设置链路处理器
        abstractActivityCheckHandler.setNextHandler(this.getHandler(config.getNext()));
        return abstractActivityCheckHandler;
    }


    private ActivityCheckConfig getActivityConfig() {
        String configJson =
                "{\"handler\":\"activityEnableCheckHandler\",\"down\":true,"
                + "\"next\":{\"handler\":\"activityExpiredCheckHandler\","
                + "\"next\":{\"handler\":\"activityAwardCheckHandler\",\"next\":null}}}";
        //转成Config对象
        return JSON.parseObject(configJson, ActivityCheckConfig.class);
    }

    private Activity queryActivity() {
        return Activity.builder().enabled(true).expired(false).awardRemainNum(10)
                .build();
    }
}
