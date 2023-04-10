package com.nature.park.client;

import com.dtflys.forest.http.ForestRequest;
import com.dtflys.forest.ssl.SSLSocketFactoryBuilder;
import com.dtflys.forest.ssl.TrustAllManager;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.security.SecureRandom;

/**
 * @author Jayden Chau
 * @date 2023/4/10 22:00
 */
public class SSLFactory implements SSLSocketFactoryBuilder {

    @Override
    public SSLSocketFactory getSSLSocketFactory(ForestRequest forestRequest, String s) throws Exception {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null,
                        new TrustManager[] {new TrustAllManager()},
                        new SecureRandom());
        return sslContext.getSocketFactory();
    }
}
