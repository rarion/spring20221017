package org.zerock.mapper.member;

import java.util.List;

import org.zerock.domain.member.MemberDTO;

public interface MemberMapper {

	int insert(MemberDTO member);

	List<MemberDTO> selectAll();

	MemberDTO select(String id);

	MemberDTO selectEmail(String email);

	int update(MemberDTO member);

	int delete(String id);


}
