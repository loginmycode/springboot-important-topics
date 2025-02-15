package com.application.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class ApplicationConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfigurationApplication.class, args);
		System.out.println("Test.....");
	}

}
@Component
class AppInitailizer implements CommandLineRunner
{

	@Value("{app.version}")
	private String appVersion;
	
	@Autowired
	private ApplicationProperties properties;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("appVersion: "+appVersion);
		System.out.println("version : "+properties.version());
		System.out.println("All Properties : "+properties);
		
	}
	}
