package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@RestController
	@ImportResource
	@Bean
public class BootProj02OnDependencyInjectionStrategyDpApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication
				.run(BootProj02OnDependencyInjectionStrategyDpApplication.class, args);) {

			Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);

			vehicle.journey("hyd", "beng");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
