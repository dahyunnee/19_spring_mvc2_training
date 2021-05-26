package com.spring.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.spring.board.dto.BoardDTO;
import com.spring.board.service.BoardService;

@Controller		//컨트롤러임을 명시(controller bean에 등록시킴)
public class BoardController {
	
	@Autowired							//DI(의존성 주입) : BoardService 객체를 스프링에서 생성하여 주입시킴
	private BoardService boardService;	//Service단 로직을 호출하기 위한 객체 생성
	
	//value : url 주소를 명시
	//method : 요청 타입을 명시
	@RequestMapping(value="/boardWrite", method=RequestMethod.GET)
	public String boardWrite() {
		return "board/bWrite";	//servlet-context.xml에 명시된 대로 포워딩할 jsp파일을 작성해준다.
	}
	
	@RequestMapping(value="/boardWrite", method=RequestMethod.POST)
	public String boardWrite(BoardDTO bdto) throws Exception {
	
		boardService.insertBoard(bdto);
		return "board/main";
	}
	
}
