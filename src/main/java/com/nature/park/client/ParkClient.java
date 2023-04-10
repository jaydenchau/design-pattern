package com.nature.park.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Header;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.SSLSocketFactoryBuilder;
import com.dtflys.forest.http.ForestResponse;

import java.util.Map;

/**
 * @author Jayden Chau
 * @date 2023/4/10 20:56
 */
@SSLSocketFactoryBuilder(SSLFactory.class)
public interface ParkClient {

    @Get("http://localhost:9090/test")
    ForestResponse<String> test();

    @Post("https://kos.keytop.cn/mercoupon/qrCode/qrCodeCheck")
    ForestResponse<ParkResult> checkQrCode(@JSONBody("token") String token);

    @Post("https://kos.keytop.cn/mercoupon/service/couponUse/useOfCustomer")
    ForestResponse<ParkResult> payByCoupon(@Header Map<String, Object> headerMap,
                                           @JSONBody("carPlateNum") String carPlateNum,
                                           @JSONBody("kosLang") String kosLang,
                                           @JSONBody("token") String token,
                                           @JSONBody("isCardNo") boolean isCardNo);
}
