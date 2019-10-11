package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.Board;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;
import com.board.model.Employee;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {
		loginCheck();
		
		while (true) {
			int menu = 0;
			System.out.println("1. 게시글 작성 | 2. 게시글 전체 조회| 3. 한건 조회 | 4. 게시글 수정 |5. 댓글 추가 |6. 수정 |7. 삭제 |9. 종료");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("게시글을 작성합니다.");
				writerBoard();
			} else if (menu == 2) {
				System.out.println("전체 게시글을 조회합니다.");
				getBoardlist();

			} else if (menu == 3) {
				System.out.println("한건 게시물을 조회합니다.");
				getBoard();

			} else if (menu == 4) {
				System.out.println("게시글을 수정합니다.");
				updateBoard();
				
			} else if (menu == 5) {
				System.out.println("5번을 선택했습니다.");
			} else if (menu == 6) {
				System.out.println("6번을 선택했습니다.");
			} else if (menu == 7) {
				System.out.println("7번을 선택했습니다.");
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	public void loginCheck() {
		while (true) {
			System.out.println("id를 입력 : ");
			String id = sc.nextLine();
			System.out.println("pswd를 입력 : ");
			String passwd = sc.nextLine();
			String name = service.loginCheck(id, passwd);
			if (name != null) {
				System.out.println(name + "님 환영한다");
				loginId = id;
				break;
			} else {
				System.out.println("id pswd 확인해");
			}
		}
	}

	public void writerBoard() {
		System.out.println("게시글작성");

		System.out.println("제목입력");
		String title = sc.nextLine();

		System.out.println("내용 입력");
		String content = sc.nextLine();

		BoardDB board = new BoardDB();
		board.setTitle(title);
		board.setContents(content);
		board.setWriter(loginId);
		service.insertBoard(board);
	}

	public void getBoardList() {

	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 게시글 번호를 입력:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		// 원글
		

		BoardDB board = service.getBoard(boardNo);
		if (board != null && board.getBoardNO() != 0) {
			System.out.println("|||||||||||||||원본|||||||||||||");
			System.out.println("제목 : " + board.getTitle());
			System.out.println("내용 : " + board.getContents());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("작성일자 : " + board.getCreationDate());

			// 댓글
			List<BoardDB> list = service.getReply(boardNo);
			if (list.size() > 0) {
				System.out.println("|||||||||||||||댓글|||||||||||||");

				for (BoardDB brd : list) {
					System.out.println("->" + brd.getBoardNO() + "|" + brd.getContents() + "|" + brd.getCreationDate());
				}
				System.out.println("======================");
			} else {
				System.out.println("댓글없음");
			}
			System.out.println("1.댓글작성 | 2.이전메뉴");
			int subMenu = sc.nextInt(); sc.nextLine();
			if (subMenu == 1) {
				System.out.println("댓글 내용을 작성하세요.");
				String reply = sc.nextLine();
				BoardDB board1 = new BoardDB();
				board1.setContents(reply);
				board1.setOrigNo(board.getBoardNO()); // boardNo과 동일
				board1.setWriter(loginId);
				service.insertReply(board1);
			} else {
				return;
			}
		} else {
			System.out.println("없는 글임");
			return;
		}
	}

	public void getBoardlist() {
		System.out.println("전체 게시글 조회.");
		List<BoardDB> list1 = service.getBoardsList();
		for (BoardDB brd : list1) {
			System.out.println(brd.getBoardNO() + ") 제목 : " + brd.getTitle() + "내용 : " + brd.getContents() + "작성자 : "
					+ brd.getWriter() + "작성일자 : " + brd.getCreationDate());
		}
	}
	
	public void updateBoard() {
		System.out.println("변경할 글 번호를 입력하세요.");
		int boardNo = sc.nextInt(); sc.nextLine();
		System.out.println("변경할 제목을 입력하세요 ");
		String title = sc.nextLine();
		System.out.println("변경 내용을 입력하세요");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNO(boardNo);
		board.setTitle(title);
		board.setContents(content);
		
		service.updateBoard(board);
	}
	
}
