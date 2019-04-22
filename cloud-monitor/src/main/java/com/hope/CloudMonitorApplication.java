package com.hope;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAdminServer
@SpringBootApplication
@EnableEurekaClient
public class CloudMonitorApplication {

	/** logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudMonitorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudMonitorApplication.class, args);
		LOGGER.info("hope-cloud-monitor 外部配置启动成功！温馨提示：代码千万行，注释第一行，命名不规范，同事泪两行");
	}
}
