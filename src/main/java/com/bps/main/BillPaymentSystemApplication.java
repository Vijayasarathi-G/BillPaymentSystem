package com.bps.main;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@ComponentScan("com.bps")
@EntityScan("com.bps.model")
//@EnableJpaAuditing
public class BillPaymentSystemApplication {

	@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hem) {
		return hem.getSessionFactory();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BillPaymentSystemApplication.class, args);
	}
}
