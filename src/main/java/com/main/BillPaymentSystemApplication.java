package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
public class BillPaymentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillPaymentSystemApplication.class, args);
	}
}
