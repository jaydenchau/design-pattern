package com.nature.design.pattern.strategy.funtion;

import org.springframework.stereotype.Service;

/**
 * @author Jayden Chau
 * @date 2023/6/12 23:48
 */
@Service
public class GrantTypeService {

    public String repPack(String resourceId) {
        return "红包发放";
    }

    public String shopping(String resourceId) {
        return "购物卷发放";
    }

    public String vip(String resourceId) {
        return "会员发放";
    }

}
