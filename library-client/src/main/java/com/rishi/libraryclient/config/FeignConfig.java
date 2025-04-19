package com.rishi.libraryclient.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "com.rishi.libraryclient.restproxy")
@Configuration
public class FeignConfig {

}
