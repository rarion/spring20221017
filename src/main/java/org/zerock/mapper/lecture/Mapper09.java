package org.zerock.mapper.lecture;

import java.util.List;

import org.zerock.domain.lecture.CategoryDTO2;
import org.zerock.domain.lecture.JavaBean04;
import org.zerock.domain.lecture.ProductDTO2;

public interface Mapper09 {
	String getCustomerNameById(int id);

	String getEmployeeFirstNameById(int id);
	
	List<String> getCustomerNameByCityAndCountry(String country, String city);

	String getSupplierNameByCityAndCountry(String country, String city);

	String getContactName(JavaBean04 bean1);

	String getSupplierContactName(JavaBean04 bean2);
	
	List<String> getProductName(CategoryDTO2 b1, ProductDTO2 b2);


}
