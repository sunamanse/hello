package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
//  Board[] boardary = new Board[10];
	List<Board> boardary = new ArrayList<>();
		
//	BoardService service = new BoardServiceImpl();
	BoardCollection service = new BoardCollectionImpl();
	
	
	public void execute() {

		while (true) {
			
			login_check();
			
			System.out.println("메뉴선택");
			System.out.println("1.작성 2.단건조회 3. 전체조회 4.삭제 5. 변경 6.종료");
			int menu = 0;
			
			try {menu = sc.nextInt();
			sc.nextLine();
			} catch (Exception e) {
				
				System.out.println("정상적인 메뉴선택 plz");
				sc.nextLine();
			}
			
			
			if (menu == 1) {
				writeBoard();
			
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				deleteBoard();	
			} else if (menu == 5) {
				updateBoard();				
			} else if (menu == 6) {			
			System.out.println("프로그램 종료");
				break;
			}

		}
		System.out.println("프로그램 종료");

	}
	
	public void login_check() {
		while(true) {
			System.out.println("id 입력. ");
			String id = sc.nextLine();
			System.out.println("pswd 입력 . ");
			String passwd = sc.nextLine();
			if(id.equals("user1") && passwd.equals("1234")) {
				System.out.println("user1 님 환영합니다.");
				break;
			} else {
				System.out.println("id, pswd를 확인하세요.");
			}
		}
	}
	
	

	public void writeBoard() {
		System.out.println("글작성");
		
		System.out.println("게시글 번호입력");
		int boardNo = sc.nextInt(); sc.nextLine();
		
		System.out.println("제목입력");
		String title = sc.nextLine(); 
		
		System.out.println("내용 입력");
		String contents = sc.nextLine();
		
		System.out.println("작성자 입력");
		String writer = sc.nextLine();
		
		Board board = new Board(boardNo, title, contents, writer);
		
		service.writerBoard(board, boardary);
		
		
		
		
//		for(int i =0; i<boardary.length; i++) {
//			if(boardary[i] == null) {
//				boardary[i] = board;
//				break;
//				
//			}
//		}
	
	}

	public void getBoard() {
		System.out.println("한건조회");
		System.out.println("조회번호 입력");
		
		int boardNo = sc.nextInt();
		
		Board board = service.getBoard(boardNo, boardary);
		System.out.println(board);
		
		
//		for(int i=0; i<boardary.length; i++) {
//			if(boardary[i]!=null && boardary[i].getBoardNo() == boardNo) {
//				System.out.println(boardary[i].getTitle() + "," + boardary[i].getContents());
//				
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체글 조회");
		
		List<Board> resultary = service.getBoardList(boardary);
		for(Board brd: resultary) {
			if(brd!=null)
			System.out.println(brd);
		}
		
//	for(int i=0; i<boardary.length; i++) {
//		if(boardary[i] != null) {
//			System.out.println(boardary[i].getTitle() +","+ boardary[i].getContents());
//		}
//	}	
	}
	
	public void updateBoard() {
		System.out.println("변경할 글 번호 : ");
		int boardNo = sc.nextInt(); sc.nextLine();
		System.out.println("변경할 내용 : ");
		String content = sc.nextLine();
		System.out.println("변경할 제목 : ");
		String title = sc.nextLine();
		System.out.println("변경할 작성자 : ");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, content ,writer); //"" = null
		service.updateBoard(board,boardary);
		
		
	}
	
	
	public void deleteBoard() {
		System.out.println("삭제할 글 번호 : ");
		int boardNo = sc.nextInt(); sc.nextLine();
		
		service.deleteBoard(boardNo, boardary);
		
		
	}

}
