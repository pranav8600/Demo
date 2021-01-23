package com.cjc.app.If.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
//@EntityScan
//@EnableJpaRepositories
public class MasterModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterModuleApplication.class, args);
	}

}
