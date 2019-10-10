package com.board.control;

import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.Board;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {
		loginCheck();
		while (true) {
			int menu = 0;
			System.out.println("1. 게시글 작성 | 2. 게시글 전체 조회| 3. 한건 조회 | 4. 댓글 조회 |5. 댓글 추가 |6. 수정 |7. 삭제 |9. 종료");
			menu = sc.nextInt(); sc.nextLine();

			if (menu == 1) {
				System.out.println("1번을 선택했습니다.");
				 writerBoard();
			} else if (menu == 2) {
				System.out.println("2번을 선택했습니다.");

			} else if (menu == 3) {
				System.out.println("3번을 선택했습니다.");
			} else if (menu == 4) {
				System.out.println("4번을 선택했습니다.");
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
}
