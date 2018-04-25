package com.test.api.config;

import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @author: chenhongwei
 * @date: Created in 上午11:42 2018/4/25
 * @version: 1.0
 */
public class HelloConfig {

    @Bean
    public RequestInterceptor getRequestInterceptor() {

        return new BasicAuthRequestInterceptor("name", "password");
    }
}
