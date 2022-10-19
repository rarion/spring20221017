package org.zerock.controller.lecture.p04attribute;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex16")
public class Controller16 {

	// ex16/sub01 요청 , /WEB-INF/views/ex16/sub01.jsp로 forward
	
	@RequestMapping("sub01")
	public void method1(HttpServletRequest req) {
		req.setAttribute("myName", "park ji sung");
	}
	
	@RequestMapping("sub02")
	public void name(HttpServletRequest req) {
		req.setAttribute("address", "seoul");
	}
}
