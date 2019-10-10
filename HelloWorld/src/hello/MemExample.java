package hello;

import java.util.Scanner;

public class MemExample {
	public static Member[] memary = new Member[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("===================================================");
			System.out.println("1. 계정생성 || 2. 계정목록 || 3. 계정조회 || 4.종료 ");
			System.out.println("===================================================");

			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				createId();
			} else if (menu == 2) {
				getIdlist();
			} else if (menu == 3) {
				findId();
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성
	public static void createId() {

		System.out.println("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.println("패스워드 입력 : ");
		String pw = sc.nextLine();
		System.out.println("사용자명 입력 : ");
		String name = sc.nextLine();
		System.out.println("사용자 나이 입력 :");
		int age = sc.nextInt();
		System.out.println("계정이 생성되었습니다.");

		Member mem = new Member(name,id,pw, age);
		for (int i = 0; i < memary.length; i++) {
			if (memary[i] == null) {
				memary[i] = mem;
				break;
			}
		}
	}

	// 계정리스트
	public static void getIdlist() {
		for (Member m : memary) {
			if (m != null)
				System.out.println("Id : " + m.getId() + "/ pw : " + m.getPassword() + "/ 소유자 : " + m.getName()
						+ "/ Age : " + m.getAge());

		}

	}

	public static void findId() {

		System.out.println("Id 를 입력하세요. ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요. ");
		String pw = sc.nextLine();
		Member m2 = new Member();

		for (Member m : memary) {
			if (m != null) {
				if (m.getId().equals(id) && m.getPassword().equals(pw)) {
					m2.setAge(m.getAge());
					m2.setId(m.getId());
					m2.setName(m.getName());
					m2.setPassword(m.getPassword());

					break;
				} else if (m.getId().equals(id) && !m.getPassword().equals(pw)) {
					m2.setAge(m.getAge());
					m2.setId(m.getId());
					m2.setName(m.getName());
					m2.setPassword(m.getPassword());
					break;
				}
			}
		}
		if (m2.getId() != null && m2.getPassword() != null) {
			System.out.println("name : " + m2.getName() + "/ age :" + m2.getAge());
		} else if (m2.getId() != null) {
			System.out.println("패스워드가 잘못되었습니다.");
		} else {
			System.out.println("존재하지 않는 계정입니다.");
		}

	}
	
	
}
