package com.kk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private EmployeeServiceImpl chefService;

	public static void main(String[] args) {

		SpringApplication springApplication = 
                new SpringApplicationBuilder()
                .sources(Application.class)
                .build();
		springApplication.setWebEnvironment(false);
        springApplication.run(args);

	}

	public void run(String... args) throws Exception {
		System.out.println("============chefService:"+chefService);
		System.out.println("==="+chefService.test());
	}

}
