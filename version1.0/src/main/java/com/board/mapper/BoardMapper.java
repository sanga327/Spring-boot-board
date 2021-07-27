package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.BoardDTO;
//import com.board.paging.Criteria;

@Mapper  // sql 쿼리 호출 - 메서드의 이름과 일치하는 SQL문을 찾아 실행 
public interface BoardMapper {

	public int insertBoard(BoardDTO params); // 게시글 생성 

	public BoardDTO selectBoardDetail(Long idx);  // 게시글 조회

	public int updateBoard(BoardDTO params);  // 게시글 수정

	public int deleteBoard(Long idx);  // idx를 사용해서 특정 게시글 삭제

	public List<BoardDTO> selectBoardList(BoardDTO params);  // 게시글 목록 조회

	public int selectBoardTotalCount(BoardDTO params);  // 게시글 개수 조회

}