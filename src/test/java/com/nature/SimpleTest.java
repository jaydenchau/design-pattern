package com.nature;

import cn.hutool.core.net.url.UrlBuilder;
import com.dtflys.forest.backend.url.URLBuilder;
import com.dtflys.forest.http.ForestResponse;
import com.nature.park.client.ParkClient;
import com.nature.park.client.ParkResult;
import com.nature.park.service.ParkService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.*;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Map;

/**
 * @author Jayden Chau
 * @date 2023/4/10 21:48
 */
@SpringBootTest
public class SimpleTest {


    @Autowired
    private ParkClient client;

    @Test
    public void testClient() {
        ForestResponse<ParkResult> response = client.checkQrCode("299852cb-10a4-4d47-8ef2-863695da0281");
        System.out.println(response.getResult());
        Map<String, Object> data = response.getResult().getData();
        Integer couponId = (Integer) data.get("couponId");
        System.out.println(couponId);
    }


    public static void main(String[] args) throws Exception {
        String url = "https://s.keytop.cn/d13wez";
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.setConnectTimeout(5000);
        String fullUrl = conn.getHeaderField("location");
        System.out.println("fullUrl = " + fullUrl);
        UrlBuilder urlBuilder = UrlBuilder.ofHttp(fullUrl);
        String token = urlBuilder.getQuery().get("token").toString();
        String lotId = urlBuilder.getQuery().get("lotId").toString();
        String host = urlBuilder.getHost();
        String scheme = urlBuilder.getScheme();
        System.out.println("scheme = " + scheme);
        System.out.println("host = " + host);
        System.out.println("token = " + token);
        System.out.println("lotId = " + lotId);
    }

}
