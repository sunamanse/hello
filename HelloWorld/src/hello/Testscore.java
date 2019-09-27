package hello;

import java.util.Arrays;
import java.util.Scanner;

public class Testscore {

	public static student[] stuary = new student[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("====================================================================");
			System.out.println("1. 성적등록 || 2. 전체리스트 || 3. 학생번호조회 || 4.전체 통계 || 5.등수 ||6. 종료");
			System.out.println("====================================================================");

			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				createScore();
			} else if (menu == 2) {
				AllList();
			} else if (menu == 3) {
				findNo();
			} else if (menu == 4) {
				Allsumavg();
			} else if (menu == 5) {
				Lank();
			} else if (menu == 6) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

	public static void createScore() {

		System.out.println("번호 입력 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("국어성적 입력 : ");
		int Kor = sc.nextInt();
		System.out.println("영어성적 입력 :");
		int Eng = sc.nextInt();
		System.out.println("수학성적 입력 :");
		int Math = sc.nextInt();
		System.out.println("점수가 등록되었습니다.");

		student stu = new student(number, name, Kor, Eng, Math);
		for (int i = 0; i < stuary.length; i++) {
			if (stuary[i] == null) {
				stuary[i] = stu;
				break;
			}
		}
	}

	public static void AllList() {
		for (student s : stuary) {
			if (s != null)
				System.out.println("학생번호 : " + s.getNum() + "/ 이름 : " + s.getName() + "/ 국어점수 : " + s.getKorScore()
						+ "/ 영어점수 : " + s.getEngScore() + "/ 수학점수 : " + s.getMathScore());

		}
	}

	public static void findNo() {
		System.out.println("학생번호 를 입력하세요. ");
		int number = sc.nextInt();

		for (student s : stuary) {
			if (s != null) {
				if (s.getNum() == number) {
					int sum = 0;
					sum = s.getKorScore() + s.getEngScore() + s.getMathScore();
					System.out.println("학생번호 : " + s.getNum() + "/ 이름 : " + s.getName() + "/ 국어점수 : " + s.getKorScore()
							+ "/ 영어점수 : " + s.getEngScore() + "/ 수학점수 : " + s.getMathScore() + "/총점 : " + sum
							+ "/ 평균 : " + sum / 3);
				}

			}

		}
	}

	public static void Allsumavg() {
		int sum = 0;
		double avg = 0.0;

		for (student s : stuary) {
			if (s != null) {
				sum = sum + s.getKorScore() + s.getEngScore() + s.getMathScore();
				avg = sum / s.getNum();

			}
		}
		System.out.println("전체 접수 합 : " + sum + "전체 평균 점수 : " + avg);
	}

	public static void Lank() {
		student temp = null;
		int cnt = 0;
		int sum = 0;

		for (student s : stuary) {
//			if (s != null) {
//				sum = sum + s.getKorScore() + s.getEngScore() + s.getMathScore();
//			}

	
		}
		
		for (int j = 0; j < cnt - 1;) {
			for (int i = 0; i < stuary.length; i++) {
				if (stuary[i] != null) {

					int a = stuary[i].getKorScore() + stuary[i].getEngScore() + stuary[i].getMathScore();
					int b = stuary[i + 1].getKorScore() + stuary[i + 1].getEngScore()+ stuary[i + 1].getMathScore();

					if (a > b) {
						temp = stuary[i + 1];
						stuary[i + 1] = stuary[i];
						stuary[i] = temp;
						cnt++;
					}

				}

			}
		}
		
		
		for(int i = 0; i < stuary.length; i++)
			System.out.println("학생이름 : " + s.getName() + "학생 번호 : " + s.getNum() + "총점 : " + sum);
	}
}