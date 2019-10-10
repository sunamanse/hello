package com.board.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.common.DAO;
import com.board.model.BoardDB;
import com.board.model.Employee;

public class BoardDBDAO { // 데이터 조회, 로그인체크
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

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
												//board_seq.nextval
		
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
