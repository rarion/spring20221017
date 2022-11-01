package org.zerock.mapper.board;

import java.util.List;

import org.zerock.domain.board.BoardDto;

public interface BoardMapper {

	int insert(BoardDto board);

	List<BoardDto> list(int offset, int records, String type, String keyword);

	BoardDto select(int id);

	int update(BoardDto board);

	
	int delete(BoardDto board);

	int countAll(String keyword, String type);
	/*
	 * int seachCountAll();
	 */
	

}
