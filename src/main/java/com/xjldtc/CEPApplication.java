package com.xjldtc;

import java.util.Arrays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@MapperScan({"com.xjldtc.user.mapper.*"})
public class CEPApplication {

	public static void main(String[] args) {
		//System.setProperty("spring.devtools.restart.enabled","false");
		ApplicationContext ctx = SpringApplication.run(CEPApplication.class, args);
		System.out.println("Let's inspect the beans provided by Spring Boot:");
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		
	}
}
