package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex02")
public class Controller02 {
	
	// 요청경로 "/ex02/sub01"
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("ex02 메소드 1 일함");
	}
	
	// 요청경로 "/ex02/sub02"
	@RequestMapping("sub02")
	public void method2() {
		System.out.println("ex02 메소드 2 일함");
	}
	
	@RequestMapping("sub03")
	public void method3() {
		System.out.println("ex02 메소드 3 일함");
	}
}
