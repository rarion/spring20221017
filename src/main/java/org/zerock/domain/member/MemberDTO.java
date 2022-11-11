package org.zerock.domain.member;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MemberDTO {
	private String id;
	private String password;
	private String email;
	
	private LocalDateTime inserted;
	
}
