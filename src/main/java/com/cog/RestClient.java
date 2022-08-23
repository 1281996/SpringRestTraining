package com.cog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {
private static String url="http://localhost:7777/user";
	public static void main(String[] args) {
		RestTemplate restTemplate=new  RestTemplate();
		ResponseEntity<String> res=restTemplate.getForEntity(url, String.class);
		System.out.println(res.getStatusCodeValue()+"-"+res.getBody());

	}

}
