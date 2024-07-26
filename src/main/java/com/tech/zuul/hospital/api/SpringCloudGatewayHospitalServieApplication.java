package com.tech.zuul.hospital.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudGatewayHospitalServieApplication {

	
	@GetMapping("/testing")
	public String test() {
		return "Test url works..";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayHospitalServieApplication.class, args);
	}

}
