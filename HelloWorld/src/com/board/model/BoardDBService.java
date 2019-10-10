package com.board.model;

import java.util.List;

public interface BoardDBService {
	
	
	//로그인체크
	public String loginCheck(String id, String passwd);
	//게시글 작성
	public void insertBoard(BoardDB board);
	//게시글 리스트
	public List<BoardDB> getBoardsList();
	//한건조회
	public BoardDB getBoard(int boardNo);
	//댓글조회
	public List<BoardDB> getReply(int boardNo);
	//댓글 추가
	public void insertReply(BoardDB board);
	//수정
	public void updateBoard(BoardDB board);
	//삭제
	public void deleteBoard(int boardNo);
	
	
	
	
	//댓글삭제
	
}	
