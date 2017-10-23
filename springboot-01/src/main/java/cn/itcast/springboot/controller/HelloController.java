package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@Autowired
	private Environment environment;
	
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;

	
	@GetMapping("/hello")
	public String hello(){
		
		//System.out.println(environment.getProperty("name"));123
		System.out.println(environment.getProperty("url"));
		
		return "hello world";
	}
	
	@GetMapping("/user")
	public String user(){
		return "/html/user.html";
	}
	
}
