package Test;

import java.util.Scanner;

public class GymExample {
	public static GymMember[] memary = new GymMember[100];
	private static Scanner sc = new Scanner(System.in);
	public static String[] nem = new String[3];

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("===================================================");
			System.out.println("1. 회원등록 || 2. 회원조회 || 3. 그룹별 리스트 ||4.종료 ");
			System.out.println("===================================================");

			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				createId();
			} else if (menu == 2) {
				findNo();
			} else if (menu == 3) {
				AllList();
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

	// 회원등록
	public static void createId() {

		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("회원번호 입력 : ");
		int MemNo = sc.nextInt();
		sc.nextLine();
		System.out.println("희망과정 입력 : ");
		String major = sc.nextLine();
		System.out.println("회원등록 완료되었습니다.");

		GymMember gym = new GymMember(name, MemNo, major);
		for (int i = 0; i < memary.length; i++) {
			if (memary[i] == null) {
				memary[i] = gym;
				break;
			}

		}
	}

	public static void findNo() {
		System.out.println("회원번호 를 입력하세요. ");
		int number = sc.nextInt();

		for (GymMember g : memary) {
			if (g != null) {
				if (g.getMemNo() == number) {
					System.out
							.println("회원이름 : " + g.getName() + "/ 회원번호 : " + g.getMemNo() + "/ 수강과목 : " + g.getMajor());
				}

			}

		}
	}

	public static void AllList() {
		System.out.println("과정을 입력하세요. ");
		String major = sc.nextLine();

		for (GymMember g : memary) {
			if (g != null) {
				if (g.getMajor().equals(major)) {
					System.out.println("수영과정 회원이름 : " + g.getName() +
	"/ 회원번호 : " + g.getMemNo() + "/ 수강과목 : " + g.getMajor());
				}
			}

		}

	}
}
