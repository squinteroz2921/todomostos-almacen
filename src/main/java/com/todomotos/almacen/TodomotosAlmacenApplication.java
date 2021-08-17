package com.todomotos.almacen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.todomotos.almacen.domain.repository"})
public class TodomotosAlmacenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodomotosAlmacenApplication.class, args);
	}


}
