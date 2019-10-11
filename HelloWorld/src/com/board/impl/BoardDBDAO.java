package com.board.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class BoardDBDAO { // 데이터 조회, 로그인체크
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public void updateBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "update boards set orig_no = orig_no ";
		if (board.getTitle() != null && !board.getTitle().equals("")) {
			sql += ",title=? ";
		}
		if (board.getContents() != null && !board.getContents().equals("")) {
			sql += ",contents=? ";
		}
		sql += "where board_no=? and orig_no is null ";
		
		int n = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			if (board.getTitle() != null && !board.getTitle().equals("")) {
				pstmt.setString(++n, board.getTitle());
			}
			if (board.getContents() != null  && !board.getContents().equals("")) {
				pstmt.setString(++n, board.getContents());
			}
			pstmt.setInt(++n, board.getBoardNO());
			pstmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 댓글작성(insertboard랑 비슷) 데이터타입
	public void replyBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values((select max(board_no)+1 " + "from boards),?,?,?,sysdate,?)"; // null을 ?로
																												// 바꿈
		// board_seq.nextval

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, board.getTitle()); //
			pstmt.setString(2, board.getContents());
			pstmt.setString(3, board.getWriter());
//			pstmt.setString(4, board.getCreationDate()); sysdate 씀
			pstmt.setInt(4, board.getOrigNo());

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<BoardDB> getBoardlist() {
		List<BoardDB> list = new ArrayList<>();
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no is null order by 1 desc";
		BoardDB brd = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				brd = new BoardDB();

				brd.setBoardNO(rs.getInt("board_no"));
				brd.setTitle(rs.getString("title"));
				brd.setWriter(rs.getString("writer"));
				brd.setContents(rs.getString("contents"));
				brd.setCreationDate(rs.getString("creation_date"));
				list.add(brd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public List<BoardDB> getReplylist(int boardNO) {
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no = " + boardNO;
		List<BoardDB> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardDB board = new BoardDB();

				board.setBoardNO(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContents(rs.getString("contents"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
				list.add(board);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}

	public BoardDB getBoard(int boardNO) {
		BoardDB board = null;
		conn = DAO.getConnect();
		String sql = "select * from boards where board_no=? and orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNO);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardDB();
				board.setBoardNO(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContents(rs.getString("contents"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return board;
	}

	public String getUserName(String id, String passwd) {
		conn = DAO.getConnect();
		String sql = "select * from user_login where id =? and passwd = ?";
		String name = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return name;
	}

	public void insertBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values((select max(board_no)+1 from boards),?,?,?,sysdate,null)";
		// board_seq.nextval

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, board.getTitle()); //
			pstmt.setString(2, board.getContents());
			pstmt.setString(3, board.getWriter());
//			pstmt.setString(4, board.getCreationDate()); sysdate 씀
//			pstmt.setInt(5, board.getOrigNo()); 원본글이라 댓글번호 ㄴㄴ

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
