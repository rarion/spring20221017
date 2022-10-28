package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.domain.lecture.SupplierDTO;

public interface Mapper11 {

	CustomerDTO getCustomerById(int id);
	
	int updateCustomer(CustomerDTO customer);

	SupplierDTO getSupplierById(int id);

	int updateSupplier(SupplierDTO supplier);

	int updateBank(int account, int money);


}
