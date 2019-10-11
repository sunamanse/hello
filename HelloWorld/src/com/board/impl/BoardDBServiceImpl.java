package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService{
	BoardDBDAO dao = new BoardDBDAO();
	
	
	@Override
	public String loginCheck(String id, String passwd) {
		String name = dao.getUserName(id, passwd);
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);
		
	}

	@Override
	public List<BoardDB> getBoardsList() {
		return dao.getBoardlist();
		
	}

	@Override
	public BoardDB getBoard(int boardNO) {
		
		return dao.getBoard(boardNO);
	}

	@Override
	public List<BoardDB> getReply(int boardNO) {
		
		return dao.getReplylist(boardNO);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.replyBoard(board);
		
		
	}

	@Override
	public void updateBoard(BoardDB board) {
		dao.updateBoard(board);
		
		
	}

	@Override
	public void deleteBoard(int boardNo) {
		
		
	}
	
	

}
