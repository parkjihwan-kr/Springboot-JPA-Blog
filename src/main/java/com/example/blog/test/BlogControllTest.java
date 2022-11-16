package com.example.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
// spring com.cos.myBlog package 이하를 스캔해서 모든 파일을 메모리에 new하는 것이 아니라
// 특정 어노테이션이 붙어 있는 클래스 파일을 new해서(IOC) 스프링 컨테이너에 관리해줌.
public class BlogControllTest {
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	 public String hello() {
		 return "<h1>hello spring boot</h1>";
	 }
}
// application.properties are renamed to application.yml
// application.yml : spring의 모든 설정을 모아놓을 수 있음