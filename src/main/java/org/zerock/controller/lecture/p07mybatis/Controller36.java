package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.domain.lecture.SupplierDTO;
import org.zerock.mapper.lecture.Mapper10;

@Configuration
@RequestMapping("ex36")
public class Controller36 {
	
	@Autowired
	private Mapper10 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		int cnt = mapper.removeCustomer();
		System.out.println(cnt + "개 레코드 삭제됨");
	}
	
	@RequestMapping("sub02")
	public void method2() {
		int cnt = mapper.removeEmployee(); // 1번 직원 삭제
		System.out.println(cnt + "개 직원 레코드 삭제됨");
	}
	
	@RequestMapping("sub03")
	public void method3(@RequestParam(name = "id", defaultValue = "0")int id) {
		int cnt = mapper.removeCustomerById(id); 
		System.out.println(cnt + "개 고객 레코드 삭제됨");
	}
	
	@RequestMapping("sub04")
	public void method4(@RequestParam(name = "id", defaultValue = "0")int id) {
		int cnt = mapper.removeEmployeeById(id); 
		System.out.println(cnt + "개 직원 레코드 삭제됨");
	}
	
	@RequestMapping("sub05")
	public void method5() {
		int cnt = mapper.addCustomer();
		System.out.println(cnt + "개 고객 정보 입력됨");
	}
	
	@RequestMapping("sub06")
	public void method6() {
		int cnt = mapper.addSuplier();
		System.out.println(cnt + "개 공급자 정보 입력됨");
	}
	
	@GetMapping("sub07")
	public void customerForm() {
		
	}	
	@PostMapping("sub07")
	public void method7(CustomerDTO customer) {
		int cnt = mapper.insertCustomer(customer);
		System.out.println(cnt + "개 고객 정보 입력됨");
	}
	
	@GetMapping("sub08") 
	public void supplierForm() {
		// forward to /WEB-INF/views/ex36/sub08
		
	}
	
	@PostMapping("sub08")
	public void method8(SupplierDTO supplier) {
		// 1. request param 수집/가공
		// 2. business logic
		int cnt = mapper.insertSupplier(supplier);
		System.out.println(cnt + "개 공급자 정보 입력됨");
		
		// 3. add attribute
		// 4. forward/ redirect
	}
	
	@GetMapping("sub09")
	public String getMethod9() {
		
		return "/ex36/sub07";
	}
	
	@PostMapping("sub09")
	public String postMethod9(CustomerDTO customer, RedirectAttributes rttr) {
		System.out.println("key:" + customer.getId()); // 0
		
		int cnt = mapper.insertCustomerAndGetKey(customer);
		System.out.println(cnt + "개 고객 정보 입력");
		System.out.println("key:" + customer.getId()); // 생성된 키값
		
		rttr.addFlashAttribute("message", customer.getId() + "번 고객 등록 완료");
		return "redirect:/ex36/sub09";
	}
	
	@GetMapping("sub10")
	public String getMethod() {
		return "/ex36/sub08";
	}
	
	@PostMapping("sub10")
	public String postMethod(SupplierDTO supplier, RedirectAttributes rttr) {
		
		int cnt = mapper.insertSupplierAndGetKey(supplier);
		System.out.println(cnt+"개 공급자 정보 입력 완료");
		System.out.println("생성된 공급자 key값: " + supplier.getId()); 
		
		rttr.addFlashAttribute("message", supplier.getId() +"번 공급자 등록되었습니다.");
		
		return "redirect:/ex36/sub10";
	}
	
}





