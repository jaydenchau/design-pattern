package com.nature.opensource.forest;

import com.dtflys.forest.annotation.Body;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.JSONBody;
import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.Var;

/**
 * @author Jayden Chau
 * @date 2023/4/4 10:04
 */
//@BaseRequest(
//        headers = {
//                "Authorization: Bearer ${token}"
//        }
//)
public interface MyClient {

    @Post("${baseUrl}/order-center/api/v1/login")
    String login(@Var("baseUrl") String baseUrl,
            @Body("username") String username,

                 @JSONBody("password") String password);

    @Get(url = "http://localhost:9099/order-center/api/v2/customers?offset=0&limit=5&customerName=114RIDGE CORP"
         )
    String getCustomers(@Var("token") String token);
}
