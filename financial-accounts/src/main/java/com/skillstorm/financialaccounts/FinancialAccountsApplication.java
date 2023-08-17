package com.skillstorm.financialaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FinancialAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialAccountsApplication.class, args);
	}

}
