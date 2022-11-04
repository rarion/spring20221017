package org.zerock.controller.lecture.p09fetch;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.domain.lecture.SupplierDTO;
import org.zerock.mapper.lecture.Mapper11;

@Controller
@RequestMapping("ex47")
public class Controller47 {
	
	@Autowired
	private Mapper11 mapper;

	@RequestMapping("sub")	
	public void method() {
			
	}
	
	@GetMapping("sub01")
	@ResponseBody
	public Map<String, String> method1() {
		return Map.of("address", "seoul", "name", "손흥민", "jop", "soccer player");
	}
	
	@GetMapping("sub03")
	@ResponseBody
	public Map<String, Object> method2() {
		return Map.of("color", List.of("blue", "red"), "model", 5, "location", "usa");
	}
	
	@GetMapping("sub04")
	@ResponseBody
	public CustomerDTO method3() {
		return mapper.getCustomerById(30);
	}
	
	@GetMapping("sub05")
	@ResponseBody
	public SupplierDTO method4() {
		return mapper.getSupplierById(34);
	}
	
	@GetMapping("sub06/{id}")
	@ResponseBody
	public CustomerDTO method6(@PathVariable int id) {
		return mapper.getCustomerById(id);
	}
	
	@GetMapping("sub07/{id}")
	@ResponseBody
	public SupplierDTO method7(@PathVariable int id) {
		return mapper.getSupplierById(id);
	}
}
