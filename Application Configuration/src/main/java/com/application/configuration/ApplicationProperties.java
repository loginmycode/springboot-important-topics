package com.application.configuration;




import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;




@ConfigurationProperties(prefix = "app")
@Validated
public record ApplicationProperties(
		String version,
		FtpProperties ftp){


	public record  FtpProperties(
			@NotBlank String host,
			@NotBlank int port,
			@NotBlank String username,
			@NotBlank String password)
	{

	}	

}

