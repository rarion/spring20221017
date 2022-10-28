package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.domain.lecture.SupplierDTO;
import org.zerock.mapper.lecture.Mapper11;

@Controller
@RequestMapping("ex37")
public class Controller37 {
	
	@Autowired
	private Mapper11 mapper;
	
	@GetMapping("sub01")
	public void getMethod1(@RequestParam(name="id", defaultValue = "0") int id, Model model) {
		// 1. 수정하기 전 고객 정보 얻기
		CustomerDTO customer = mapper.getCustomerById(id);
		// 2. ModelAttribute로 추가하고
		model.addAttribute("customer", customer);
		// 3. forward
	}
	
	@PostMapping("sub01")
	public String postMethod1(CustomerDTO customer, RedirectAttributes rttr) {
		// 1. parameter 수집
		
		// 2, business 로직 처리
		int cnt = mapper.updateCustomer(customer);
		System.out.println(cnt + "개의 고객 정보가 수정되었습니다");
		
		// 3. attribute 추가
		rttr.addAttribute("id", customer.getId());
		
		// 4. redirect
		return  "redirect:/ex37/sub01";
	}
	
	// 공급자정보 변경
	// 경로 : sub02
	// 빈 : SupplierrDTO
	
	@GetMapping("sub02")
	public void getMethod2(@RequestParam(name="id", defaultValue = "0" ) int id, Model model) {
		SupplierDTO supplier = mapper.getSupplierById(id);
		model.addAttribute("supplier", supplier);
	}
	
	@PostMapping("sub02")
	public String postMethod2(SupplierDTO supplier, RedirectAttributes rttr) {
		int cnt = mapper.updateSupplier(supplier);
		System.out.println(cnt +"개의 공급자 정보가 수정되었습니다");
		
		rttr.addAttribute("id", supplier.getId());
		
		return "redirect:/ex37/sub02";
				
	}
}
