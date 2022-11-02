package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

	
@Controller // view-service connection
@RequestMapping("ex42")
public class Controller42 {
	
	@RequestMapping("sub")
	public void method0() {
		
	}
	
	@GetMapping(path="sub01", produces = "text/plain")
	public void method1() {
		System.out.println("/ex42/sub01 method 일함");
	}
	@GetMapping(path="sub01", produces = "text/html")
	public void method2() {
		System.out.println("/ex42/sub01(2) method 일함");
	}
}
