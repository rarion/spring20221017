package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.CategoryDTO;
import org.zerock.domain.lecture.SupplierDTO;
import org.zerock.mapper.lecture.Mapper06;

@Controller
@RequestMapping("ex33")
public class Controller33 {
	
	@Autowired
	private Mapper06 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		CategoryDTO category = mapper.getCategory();
		System.out.println(category.getId());
		System.out.println(category.getName());
		category.getProductName().forEach(System.out::println);
	}
	
	@RequestMapping("sub02")
	public void method2() {
		SupplierDTO supplier = mapper.getSupplier();
		System.out.println(supplier.getId());
		System.out.println(supplier.getName());
		supplier.getProductName().forEach(System.out::println);
	}
}
