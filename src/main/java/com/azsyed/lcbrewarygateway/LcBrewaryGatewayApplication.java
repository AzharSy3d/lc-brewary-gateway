package com.azsyed.lcbrewarygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LcBrewaryGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcBrewaryGatewayApplication.class, args);
    }

}
