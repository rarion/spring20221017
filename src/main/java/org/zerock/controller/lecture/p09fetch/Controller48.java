package org.zerock.controller.lecture.p09fetch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.domain.lecture.SupplierDTO;
import org.zerock.mapper.lecture.Mapper11;

@Controller
@RequestMapping("ex48")
public class Controller48 {
	
	@Autowired
	private Mapper11 mapper;

	@GetMapping("sub")
	public void method() {
		
	}
	
	@GetMapping("sub01")
	@ResponseBody
	public List<CustomerDTO> method01() {
		List<CustomerDTO> customers = mapper.getCustomers();
		
		return customers;
	}
	
	@GetMapping("sub02")
	@ResponseBody
	public List<SupplierDTO> method02() {
		List<SupplierDTO> customers = mapper.getSuppliers();
		
		return customers;
	}
}












