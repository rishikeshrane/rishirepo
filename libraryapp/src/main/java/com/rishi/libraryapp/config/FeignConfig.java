package com.rishi.libraryapp.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.rishi.libraryapp.restproxy")
public class FeignConfig {

}
