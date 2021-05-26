package com.spring.board.dao;

import com.spring.board.dto.BoardDTO;

public interface BoardDAO {
	
	public void insert(BoardDTO dto) throws Exception;
}
