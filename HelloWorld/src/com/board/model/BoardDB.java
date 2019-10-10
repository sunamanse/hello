package com.board.model;

public class BoardDB {
	
	private int boardNO;
	private String title;
	private String contents;
	private String writer;
	private String creationDate;
	private int origNo;
	public int getBoardNO() {
		return boardNO;
	}
	public void setBoardNO(int boardNO) {
		this.boardNO = boardNO;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public int getOrigNo() {
		return origNo;
	}
	public void setOrigNo(int origNo) {
		this.origNo = origNo;
	}
	
}
