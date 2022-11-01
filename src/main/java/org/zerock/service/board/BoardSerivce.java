package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.BoardDto;
import org.zerock.domain.board.PageInfo;
import org.zerock.mapper.board.BoardMapper;

@Service
public class BoardSerivce {

	@Autowired
	private BoardMapper mapper;
	
	public int register(BoardDto board) {
		return mapper.insert(board);
	}

	public List<BoardDto> listBoard(int page, String type, String keyword, PageInfo pageInfo) {
		int records = 10;
		int offset = (page - 1) * records;
	
		
		int countAll = mapper.countAll("%"+keyword+"%", type); // SELECT Count(*) FROM Board
		int lastPage = (countAll - 1) / records + 1;
		
		
		int leftPageNumber = (page - 1) / 10 * 10 + 1;
		int rightPageNumber = leftPageNumber + 9;
		int currentPageNumber = page;
		rightPageNumber = Math.min(rightPageNumber, lastPage);
		boolean hasNextPageNumber = page <= ((lastPage-1)/10*10);
		
		pageInfo.setHasNextPageNumber(hasNextPageNumber);
		pageInfo.setCurrentPageNumber(currentPageNumber);
		pageInfo.setLeftPageNumber(leftPageNumber);
		pageInfo.setRightPageNumber(rightPageNumber);
		pageInfo.setLastPageNumber(lastPage);
		
		/* int seachCountAll = mapper.seachCountAll(); */
		return mapper.list(offset, records, type, "%" + keyword + "%");
	}

	public BoardDto get(int id) {
		// TODO Auto-generated method stub
		return mapper.select(id);
	}

	public int update(BoardDto board) {
		// TODO Auto-generated method stub
		return mapper.update(board);
		
	}

	public int delete(BoardDto board) {
		// TODO Auto-generated method stub
		return mapper.delete(board);
		
	}

	public List<BoardDto> recommendList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
