package org.zerock.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.member.MemberDTO;
import org.zerock.mapper.member.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper mapper;
	
	public int insert(MemberDTO member) {
		
		return mapper.insert(member);
	}

	public List<MemberDTO> list() {
		
		return mapper.selectAll();
	}

	public MemberDTO get(String id) {
		
		return mapper.select(id);
	}

	public int update(MemberDTO member) {
		
		int cnt = 0;
		
		try {
			return mapper.update(member);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cnt; 
	}

	public int remove(String id) {
		
		return mapper.delete(id);
	}
	
}
