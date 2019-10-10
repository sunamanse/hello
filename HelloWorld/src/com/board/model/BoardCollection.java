package com.board.model;

import java.util.List;

public interface BoardCollection {

public void writerBoard ( Board board, List<Board> boards);
public Board getBoard(int boardNo,List<Board> boards);
public List<Board> getBoardList(List<Board> boards);
public void updateBoard(Board board, List<Board> boardary);
void deleteBoard(int boardNo, List<Board> boards);

}