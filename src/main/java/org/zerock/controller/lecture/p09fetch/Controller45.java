package org.zerock.controller.lecture.p09fetch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.JavaBean11;
import org.zerock.domain.lecture.JavaBean15;
import org.zerock.domain.lecture.JavaBean16;
import org.zerock.domain.lecture.JavaBean17;
import org.zerock.domain.lecture.JavaBean18;

@Controller
@RequestMapping("ex45")
public class Controller45 {

	@RequestMapping("sub")
	public void method() {

	}

	@GetMapping("sub01")
	public ResponseEntity method01() {
//		return ResponseEntity.ok().build();
//		return ResponseEntity.badRequest().build();
//		return ResponseEntity.notFound().build();
		return ResponseEntity.status(500).build();
	}
	
	@GetMapping("sub02")
	public ResponseEntity method02() {
//		return ResponseEntity.accepted().build();
		return ResponseEntity.status(202).build();
	}
	
	@GetMapping("sub03")
	public ResponseEntity method03() {
		
		return ResponseEntity.ok().header("My-Header", "My-Value").build();
	}
	
	@GetMapping("sub04")
	public ResponseEntity method04() {
		
		return ResponseEntity.ok().header("Your-Header", "Your-Value").build();
	}
	
	@GetMapping("sub05")
	public ResponseEntity<String> method05() {
		
		return ResponseEntity
				.ok()
				.header("Content-Type", "text/plain;charset=UTF-8")
				.body("Hello world, 진심으로 환영합니다");
	}
	
	@GetMapping("sub06") // <others> : json
	public ResponseEntity<JavaBean15> method06() {
		JavaBean15 data = new JavaBean15();
		data.setLocation("서울");
		data.setSince("2000년");
		
		return ResponseEntity.ok().body(data);
	}
	
	@GetMapping("sub07")
	public ResponseEntity<JavaBean11> method07() {
		JavaBean11 data = new JavaBean11();
		data.setName("손흥민");
		data.setAddress("서울");
		
		return ResponseEntity.ok().body(data);
	}
	
	@GetMapping("sub08")
	public ResponseEntity<JavaBean18> method08() {
		JavaBean18 data = new JavaBean18();
		data.setName("박지성");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		return ResponseEntity.ok(data);
	}

	@GetMapping("sub09")
	public ResponseEntity<JavaBean16> method09() {
		JavaBean16 data = new JavaBean16();
		JavaBean17 sub = new JavaBean17();
		
		data.setAge(27);
		sub.setAddress(List.of("서울", "부산", "제주"));
		sub.setMarried(true);
		data.setInfo(sub);
		
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("sub10")
	@ResponseBody
	public JavaBean16 method10() {
		JavaBean16 data = new JavaBean16();
		JavaBean17 sub = new JavaBean17();
		
		sub.setAddress(List.of("서울", "부산", "제주"));
		sub.setMarried(true);
		
		data.setInfo(sub);
		data.setAge(99);
		
		return data;
	}
	
	// sub11 요청경로
	// JavaBean27을 json으로 변경한 응답하는 method 작성
	// @ResponseBody 사용
	@GetMapping("sub11")
	@ResponseBody
	public JavaBean18 method11() {
		JavaBean18 data = new JavaBean18();
		data.setName("박지성");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		return data;
	}

}











