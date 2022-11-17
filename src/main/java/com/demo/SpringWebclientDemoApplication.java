package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * 
 * @author Jagan
 * Demo on how to consume rest apis using Spring WebClient
 *
 */
@SpringBootApplication
public class SpringWebclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebclientDemoApplication.class, args);
	}
	
	//WebClient.Builder used to create WebClient object 
	/**
	 * 
	 * @return builder object with base url 
	 */
	@Bean
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com/");
	}

}
