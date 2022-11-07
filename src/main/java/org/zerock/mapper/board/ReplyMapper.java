package org.zerock.mapper.board;

import java.util.List;

import org.zerock.domain.board.ReplyDTO;

public interface ReplyMapper {

	int insert(ReplyDTO reply);

	List<ReplyDTO> selectReplyByBoardId(int boardId);

	int deleteById(int id);
	
	ReplyDTO selectById(int id);

	int update(ReplyDTO reply);

}
