package com.board.model;

import java.util.List;

public interface BoardService {
	public void writerBoard ( Board board, Board[] boards);
	public Board getBoard(int boardNo, Board[] boards);
	public Board[] getBoardList(Board[] boards);
	public void updateBoard(Board board, Board[] boardary);
}