package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HttpControllerTest {
	
	private static final String TAG = "HttpControllerTest : ";
	
	//localhost:8080/http/get
	@GetMapping("/http/get")
	public String getTest(Member m) {
		
		return "get要請 : " + m.getId()+","+m.getUsername()+","+m.getEmail();
	}
	
	@PostMapping("/http/post")
	public String postTest(Member m) {
		return "post要請 : " + m.getId()+","+m.getUsername()+","+m.getEmail();
	}
	
	@PostMapping("/http/post1")
	public String postTest1(@RequestBody Member m) {
		return "post要請 : " + m.getId()+","+m.getUsername()+","+m.getEmail();
	}
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put要請 : " + m.getId()+","+m.getUsername()+","+m.getEmail();
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete要請";
	}
	

}
