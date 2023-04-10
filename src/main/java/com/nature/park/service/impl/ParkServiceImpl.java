package com.nature.park.service.impl;

import cn.hutool.core.net.url.UrlBuilder;
import com.nature.park.service.ParkService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jayden Chau
 * @date 2023/4/10 20:55
 */
@Service
public class ParkServiceImpl implements ParkService {

    @Value("${park.code.url}")
    private String qrcodeUrl;

    @Override
    public void pay() throws IOException {
        Map<String, String> param = getParamByUrl();
        String token = param.get("token");
        String lotId = param.get("lotId");
        String host = param.get("host");
        String scheme = param.get("scheme");
    }

    public Map<String, String> getParamByUrl() throws IOException {
        Map<String, String> map = new HashMap<>();
        HttpURLConnection conn = (HttpURLConnection) new URL(qrcodeUrl).openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.setConnectTimeout(5000);
        String fullUrl = conn.getHeaderField("location");
        UrlBuilder urlBuilder = UrlBuilder.ofHttp(fullUrl);
        String host = urlBuilder.getHost();
        String scheme = urlBuilder.getScheme();
        String token = urlBuilder.getQuery().get("token").toString();
        String lotId = urlBuilder.getQuery().get("lotId").toString();
        map.put("token", token);
        map.put("lotId", lotId);
        map.put("host", host);
        map.put("scheme", scheme);
        return map;
    }
}
