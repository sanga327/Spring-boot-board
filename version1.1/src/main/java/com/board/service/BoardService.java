package com.board.service;

import java.util.List;

import com.board.domain.BoardDTO;
//import com.board.paging.Criteria;

public interface BoardService {

	public boolean registerBoard(BoardDTO params);

	public BoardDTO getBoardDetail(Long idx);

	public boolean deleteBoard(Long idx);

	public List<BoardDTO> getBoardList(BoardDTO params);
	
	public boolean cntPlus(Long idx);
}