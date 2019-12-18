package com.wcmei.demo.service.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.apache.dubbo.container.Main;

/**
 * @author wcmei
 * @date 2019-12-12
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DemoRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRedisApplication.class, args);
    }
    //指定启动配置文件
//    public static void main(String[] args) {
//        new SpringApplicationBuilder(RedisApplication.class)
//                .properties(DevConstants.SPRING_PROFILE)
//                .run(args);
//        Main.main(args);
//    }
//
//    public class DevConstants {
    //对应：bootstrap-dev.properties配置文件
//        public static final String SPRING_PROFILE = "spring.profiles.active=dev";
//    }
}
