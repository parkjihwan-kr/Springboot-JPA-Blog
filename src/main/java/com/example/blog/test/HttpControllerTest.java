
package com.example.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML 파일)
//@Controller
// 사용자가 요청 -> 응답(data)
@RestController
//사용자가 요청 > 응답(data), get방식
public class HttpControllerTest {
	//405에러, 인터넷브라우저 요청은 무조건 get요청밖에 할 수 없기 때문에
	// post, put, delete는 안됨
	//http://localhost:8080/http/get (select)
	/*public String getTest(@RequestParam int id, @RequestParam String username) {
		// Member m, parameter 객체화 가능
		return "get 요청" + m.getId + ", "+m.getUsername;
	}*/
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청 : "+ m.getId() +" "+ m.getUsername() +" "+ m.getPassword() +" "+m.getEmail();
	}
	//http://localhost:8080/http/post (insert)
	@PostMapping("/http/post")
	// aplication json
	public String postTest(@RequestBody Member m) {
		return "post 요청 : "+ m.getId() +" "+ m.getUsername() +" "+ m.getPassword() +" "+m.getEmail();
	}
	//http://localhost:8080/http/put (update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청"+ m.getId() +" "+ m.getUsername() +" "+ m.getPassword() +" "+m.getEmail();
	}
	//http://localhost:8080/http/delete(delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}