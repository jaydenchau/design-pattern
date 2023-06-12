package com.nature.design.pattern.strategy.funtion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Jayden Chau
 * @date 2023/6/12 23:50
 */
@Service
public class QueryGrantTypeService {

    @Resource
    private GrantTypeService grantTypeService;
    private Map<String, Function<String, String>> queryGrantTypeServiceMap = new HashMap<>();

    @PostConstruct
    public void init() {
        queryGrantTypeServiceMap.put("红包", grantTypeService::repPack);
        queryGrantTypeServiceMap.put("购物卷", grantTypeService::shopping);
        queryGrantTypeServiceMap.put("会员", grantTypeService::vip);
    }

    public String query(String resourceName) {
        Function<String, String> function = queryGrantTypeServiceMap.get(resourceName);
        if (function != null) {
            return function.apply(resourceName);
        }
        return "服务不存在";
    }
}
