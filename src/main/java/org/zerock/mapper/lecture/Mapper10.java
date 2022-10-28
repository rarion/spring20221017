package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.domain.lecture.SupplierDTO;

public interface Mapper10 {
	
	int removeCustomer();

	int removeEmployee();
	
	int removeCustomerById(int id);

	int removeEmployeeById(int id);

	int addCustomer();

	int addSuplier();
	
	int insertCustomer(CustomerDTO customer);

	int insertSupplier(SupplierDTO supplier);

	int insertCustomerAndGetKey(CustomerDTO customer);
	
	int insertSupplierAndGetKey(SupplierDTO supplier);


}
