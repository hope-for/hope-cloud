package com.hope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication {
    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(CloudEurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class, args);
        LOGGER.info("hope-cloud-eureka 注册中心启动成功！http://localhost:8761 温馨提示：代码千万行，注释第一行，命名不规范，同事泪两行");
    }

}
