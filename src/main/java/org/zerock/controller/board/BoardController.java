package org.zerock.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.board.BoardDto;
import org.zerock.domain.board.PageInfo;
import org.zerock.service.board.BoardSerivce;


@Controller
@RequestMapping("board")
public class BoardController {

	@Autowired
	private BoardSerivce service;

	@GetMapping("register")
	public void register() {
		// 게시물 작성 view로 포워드
		// /WEB-INF/views/board/register.jsp
	}

	@PostMapping("register")
	public String register(BoardDto board, RedirectAttributes rttr) {

		int cnt = service.register(board);

		if (cnt == 1) {
			rttr.addFlashAttribute("message", "새 게시물이 등록되었습니다.");
		} else {
			rttr.addFlashAttribute("message", "새 게시물이 등록되지 않았습니다.");
		}
		
		return "redirect:/board/list";
	}

	@GetMapping("list")
	public void list(@RequestParam(name="page", defaultValue = "1") int page,
						@RequestParam(name="t", defaultValue = "all") String type,
						@RequestParam(name="q", defaultValue = "") String keyword,						
						PageInfo pageInfo,
						Model model) {
		
		
		
		List<BoardDto> list = service.listBoard(page,type, keyword, pageInfo);

		model.addAttribute("boardList", list);

	}

	@GetMapping("get")
	public void get(int id, Model model) {
		// business logic ( db에서 게시물 가져오기 )
		BoardDto board = service.get(id);
		System.out.println(board);

		model.addAttribute("board",board);
	}
	
	@GetMapping("modify")
	public void modify(int id, Model model) {
		// business logic ( db에서 게시물 가져오기 )
		BoardDto board = service.get(id);
		System.out.println(board);

		model.addAttribute("board",board);
	}
	
	@PostMapping("modify")
	public String modify(BoardDto board, RedirectAttributes rttr) {
		int cnt = service.update(board);
		
		if(cnt==1) {	
			rttr.addFlashAttribute("message",  board.getId()+"번 게시물이 수정되었습니다");
		} else {
			rttr.addFlashAttribute("message", board.getId()+"번 게시물의 수정을 실패하였습니다");
		}
		
		return "redirect:/board/list";
	}
	
	@GetMapping("remove")
	public void remove(int id, Model model) {
		// business logic ( db에서 게시물 가져오기 )
		BoardDto board = service.get(id);
		System.out.println(board);

		model.addAttribute("board",board);
	}
	
	@PostMapping("remove")
	public String remove(BoardDto board, RedirectAttributes rttr) {
		
		int cnt = service.delete(board);
		
		if(cnt==1) {	
			rttr.addFlashAttribute("message", board.getId()+"번 게시물이 삭제되었습니다");
		} else {
			rttr.addFlashAttribute("message", board.getId()+"번 게시물의 삭제를 실패하였습니다");
		}
		
		return "redirect:/board/list";
	}
	
	@GetMapping("recommend")
	public void pop(int id, Model model) {
		List<BoardDto> recommendList = service.recommendList();
		model.addAttribute("boardList", recommendList);
	}
	

}