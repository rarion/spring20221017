package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.domain.lecture.SupplierDTO2;

public interface Mapper10 {
	
	int removeCustomer();

	int removeEmployee();
	
	int removeCustomerById(int id);

	int removeEmployeeById(int id);

	int addCustomer();

	int addSuplier();
	
	int insertCustomer(CustomerDTO customer);

	int insertSupplier(SupplierDTO2 supplier);

}
