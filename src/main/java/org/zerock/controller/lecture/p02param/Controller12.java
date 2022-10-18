package org.zerock.controller.lecture.p02param;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex12")
public class Controller12 {

	// /ex12/sub01?city=seoul&city=ny&city=tokyo
	@GetMapping("sub01")
	public void method1(String city) {
		System.out.println(city);
	}

	@GetMapping("sub02")
	public void method2(String[] city) {
		System.out.println(city.length);
		System.out.println(Arrays.toString(city));
	}
	
	@GetMapping("sub03")
	public void method3(@RequestParam("city") List<String> city) {
		System.out.println(city.size());
		System.out.println(city);
	}
	
	@RequestMapping("sub04")
	public void method4(String name, String address, int age, String email, String password) {
		System.out.println("method4");
		
		System.out.println("name: "+name+", address: "+address+", age: "+age+", email: "+email+", password: "+password);
	}
	
}
