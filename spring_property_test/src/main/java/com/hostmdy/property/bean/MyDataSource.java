package com.hostmdy.property.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "oracle")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyDataSource {

	private String username;
	private String password;
	private String url;
	
	
}
