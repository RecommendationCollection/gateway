package com.zuul.springbootzuulgatewayproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableHystrixDashboard
//@EnableEurekaClient
public class SpringBootZuulgatewayproxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootZuulgatewayproxyApplication.class, args);
    }

}
