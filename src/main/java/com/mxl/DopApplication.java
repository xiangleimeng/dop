package com.mxl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mxl.mapper")
public class DopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DopApplication.class, args);
	}

}
