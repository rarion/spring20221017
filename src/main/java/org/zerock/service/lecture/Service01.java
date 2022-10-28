package org.zerock.service.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.lecture.CustomerDTO;
import org.zerock.mapper.lecture.Mapper11;

@Service
@Transactional
public class Service01 {

	@Autowired
	private Mapper11 mapper;
	
	public CustomerDTO getCustomer(int id) {
		// business logic
		
		return mapper.getCustomerById(id);
		
	}

	/*
	 * @Transactional // root.xml - transaction
	 */	
	public void transferMoney() {
		// 1번 고객의 돈을(500원) 2번 고객에게 전달
		int cnt = mapper.updateBank(1, -500);
		System.out.println(cnt + "건 성공");
		int a = 3/0;
		
		mapper.updateBank(2, 500);
	}
	
}
