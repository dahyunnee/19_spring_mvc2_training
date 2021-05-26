package com.spring.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.dto.BoardDTO;

@Repository		//Data Access Object(데이터 접근 객체는) Repository를 명시해야 한다.
				//현재 클래스를 DAO bean으로 등록시킨다.
public class BoardDAOImpl implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(BoardDTO bdto) throws Exception {
							//매퍼 파일의 namespace명.id명				,매개변수
		sqlSession.insert("com.spring.mapper.BoardMapper.insertBoard", bdto);
		
	}

	
}
