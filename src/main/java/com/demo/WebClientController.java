package com.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClientController {

	@Autowired
	private WebClientService webClientService;
	
	/**
	 * REST API to consume other REST API
	 * @return
	 */
	@GetMapping("/posts")
	public List<PostModel> getAllPosts() {
		
		PostModel[] posts = webClientService.getAllPosts();
		return Arrays.asList(posts);
		
	}
}
