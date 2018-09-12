package com.zcpspace.SpringMyBatis_day01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zcpspace")
public class SpringMyBatisDay01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMyBatisDay01Application.class, args);
	}
}
