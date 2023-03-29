package com.nature.design.pattern.client;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Jayden Chau
 * @date 2023/2/6 14:57
 */
@SpringBootTest
public class ClientTest {

    @Resource
    private OrderCenterClient orderCenterClient;

    @Test
    void testDownloadOA() {
        String token = "Bearer eyJ0eXAiOiJqd3QiLCJhbGciOiJIUzI1NiJ9.eyJ0b2tlblJlZnJlc2hFeHBpcmVEYXRlIjoxNjc1NjcwNTg3NzgxLCJjb21wYW55SWQiOjM0LCJ0b2tlbkV4cGlyZURhdGUiOjE2NzU2Njg3ODc3ODEsInNlc3Npb25JZCI6Ijk5MDM3Y2I1LTMwYmYtNDVlNi1iZWU3LWJjZTM5ZDhmNTQ0OCIsInVzZXJJZCI6MTgyMTIsImlhdCI6MTY3NTY2Njk4NywiZXhwIjoxNjc1NzUzMzg3fQ.mgCDGx6hGInPTRrmbRmKHZNNdWf_rr8smdXOZ54hBsg";
        List<Integer> seasonIdList = new ArrayList<>();
        seasonIdList.add(727);
        OrderAcknowledgementQuery query = new OrderAcknowledgementQuery();
        query.setSeasonIds(seasonIdList);
        query.setStartDate("2023-01-31");
        query.setEndDate("2023-02-10");
        query.setCurrencyCode("EUR");
        query.setOrderStatusId(0);
        query.setDateField("orderDate");
        for (int i = 1; i <= 15; i++) {
            UUID flag = UUID.randomUUID();
            System.out.println("发送请求.. flag : " + flag);
            String response = orderCenterClient.sendPost(query, token);
            System.out.println("响应: " + response + " flag : " + flag);
//            new Thread(() -> {
//                UUID flag = UUID.randomUUID();
//                System.out.println("发送请求.. flag : " + flag);
//                String response = orderCenterClient.sendPost(query, token);
//                System.out.println("响应: " + response + " flag : " + flag);
//            }).start();
        }
    }

}
