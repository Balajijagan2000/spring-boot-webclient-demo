package com.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebClientService {
	
	//WebClient.Builder bean is given at runtime
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	/**
	 * 
	 * @return array of posts
	 */
	public PostModel[] getAllPosts() {
				
		//build() method will create a WebClient object which is used
		//to make api calls
		/**
		 * bodyToMono() is like promise which will wait for the data from api
		 */
		PostModel[] posts =  webClientBuilder
												.build()
												.get()
												.uri("/posts")
												.accept(MediaType.APPLICATION_JSON)
												//retrieve method makes a call to api
												.retrieve()
												.bodyToMono(PostModel[].class)
												//block method simulates a synchronous behaviour
												.block();
		
		
		return posts;
												
	}
	
	
	
}
