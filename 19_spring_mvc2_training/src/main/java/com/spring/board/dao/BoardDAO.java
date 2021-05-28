package com.spring.board.dao;

import java.util.List;

import com.spring.board.dto.BoardDTO;

public interface BoardDAO {
	
	public BoardDTO selectOne(int num) throws Exception;
	public void insert(BoardDTO dto) throws Exception;
	public List<BoardDTO> selectAll() throws Exception;
}
