package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean11;
import org.zerock.domain.lecture.JavaBean12;
import org.zerock.domain.lecture.JavaBean13;
import org.zerock.domain.lecture.JavaBean14;
import org.zerock.domain.lecture.JavaBean16;
import org.zerock.domain.lecture.JavaBean18;

@Controller
@RequestMapping("ex44")
public class Controller44 {
	
	@RequestMapping("sub")
	public void method() {
		
	}
	
	@PostMapping("sub01")
	public void method1(String name, String address) {
		System.out.println("method1 일함");
		System.out.println(name);
		System.out.println(address);
	}
	
	@PostMapping("sub02")
	public void method2(@RequestBody String data) {
		System.out.println("method2 일함");
		System.out.println(data);
	}
	
	@PostMapping("sub03")
	public void method3(@RequestBody JavaBean11 data) {
		System.out.println("3번 메소드 일함");
		System.out.println(data);
	}
	
	@PostMapping("sub04")
	public void method4(@RequestBody JavaBean12 data) {
		System.out.println(data);
	}
	
	@PostMapping("sub05")
	public void method5(@RequestBody JavaBean13 data) {
		System.out.println(data);
	}
	
	@PostMapping("sub06")
	public void method6(@RequestBody JavaBean14 data) {
		System.out.println(data);
	}
	
	@PostMapping("sub07")
	public void method7(@RequestBody JavaBean16 data) {
		System.out.println(data);
	}
	
	@PostMapping("sub14")
	public void method14(@RequestBody JavaBean18 data) {
		System.out.println(data);
	}
	
	@GetMapping("sub15/{id}")
	public void method15(@PathVariable("id") String id) {
		System.out.println(id);
	}
	
	// path variable 자동 형변환
	// parameter 명과 path variable 이름이 같으면 value속성 생략 가능
	@GetMapping("sub16/{d}")
	public void method16(@PathVariable int d) {
		System.out.println(d);//99
	}
	
}
