package org.zerock.mapper.lecture;

import java.util.List;

import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.domain.lecture.SupplierDTO;

public interface Mapper11 {

	CustomerDTO getCustomerById(int id);
	
	int updateCustomer(CustomerDTO customer);

	SupplierDTO getSupplierById(int id);

	int updateSupplier(SupplierDTO supplier);

	int updateBank(int account, int money);

	int insertCustomer(CustomerDTO customer);

	int insertSupplier(SupplierDTO supplier);

	int deleteCustomer(int id);

	int deleteSupplier(int id);

	List<CustomerDTO> getCustomers();

	List<SupplierDTO> getSuppliers();



}
