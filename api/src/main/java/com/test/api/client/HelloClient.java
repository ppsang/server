package com.test.api.client;

import com.test.api.config.HelloConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: chenhongwei
 * @date: Created in 上午11:38 2018/4/25
 * @version: 1.0
 */
@FeignClient(value = "helloClient", url = "http://localhost:9000", configuration = HelloConfig.class)
public interface HelloClient {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE})
    String sayHello();
}
