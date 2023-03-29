package com.nature.design.pattern.client;

import com.dtflys.forest.annotation.Header;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;

/**
 * @author Jayden Chau
 * @date 2023/2/6 14:53
 */
public interface OrderCenterClient {

    @Post("https://uggemea.qa.dexpo.deckers.com/order-center/api/v1/orders/download/multiple/orderAcknowledgement")
    String sendPost(@JSONBody OrderAcknowledgementQuery query,  @Header("authorization") String token);
}
