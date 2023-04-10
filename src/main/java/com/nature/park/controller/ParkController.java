package com.nature.park.controller;

import com.dtflys.forest.http.ForestResponse;
import com.nature.park.client.ParkClient;
import com.nature.park.client.ParkResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jayden Chau
 * @date 2023/4/10 20:51
 */
@RestController
public class ParkController {

    @Autowired
    private ParkClient client;

    @GetMapping("/test")
    public String test() {
        return "test";
    }
    @GetMapping("/test3")
    public String test3() {
        ForestResponse<ParkResult> response = client.checkQrCode("299852cb-10a4-4d47-8ef2-863695da0281");
        ParkResult result = response.getResult();
        System.out.println(result);
        return "test3";
    }

    @GetMapping("/test2")
    public String test2() {
        ForestResponse<String> response = client.test();
        System.out.println(response.getResult());
        return "test2";
    }


}
