package com.cluz.hrgateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.SpringVersion;


@SpringBootApplication
@EnableEurekaClient
public class HrGatewayApplication implements CommandLineRunner {

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) {
		SpringApplication.run(HrGatewayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application Name => " + appName);
		System.out.println("Spring Version => " + SpringVersion.getVersion());
		System.out.println("SpringBoot Version => " + SpringBootVersion.getVersion());
		System.out.println("Java Version => " + System.getProperty("java.version"));
	}
}
