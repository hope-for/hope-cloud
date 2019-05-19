package com.hope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudGatewayApplication {

	/** logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudGatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
		LOGGER.info("hope-cloud-gateway 网关启动成功！温馨提示：代码千万行，注释第一行，命名不规范，同事泪两行");
	}

}
