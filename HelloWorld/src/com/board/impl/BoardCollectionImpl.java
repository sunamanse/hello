package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writerBoard(Board board, List<Board> boards) {
		boards.add(board);

	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board board = null;
		for (Board b : boards) {
			if (b.getBoardNo() == boardNo) {
				board = b;
			}
		}
		return board;

	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {
		List<Board> list = new ArrayList<>();
		for (Board b : boards) {
			list.add(b);
		}
		return list;

	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for (Board b : boards) {
			if (b.getBoardNo() == board.getBoardNo()) {
				b.setTitle(board.getTitle());
				b.setContents(board.getContents());
				b.setWriter(board.getWriter());
			}

		}
	}

	@Override
	public void deleteBoard(int boardNo, List<Board> boards) {
		for (Board b : boards) {
			if (b.getBoardNo() == boardNo) {
				boards.remove(b);

			}

		}

	}

}
