package hello;

import java.util.Scanner;

public class AccountExample {
	public static Account[] accountary = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("========================");
			System.out.println("1. 계좌생성 || 2. 계좌목록 || 3. 입금 || 4.출금 || 5.종료 ");
			System.out.println("=========================");

			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				getAccoutlist();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

	// 계좌인스턴스 만드는 메소드
	public static void createAccount() {
		System.out.println("createAccount()");
		System.out.println("계좌번호 입력 : ");
		String No = sc.nextLine();
		System.out.println("사용자명 입력 : ");
		String name = sc.nextLine();
		System.out.println("첫 계좌금액 : ");
		int balance = sc.nextInt();
		Account act = new Account(No, name, balance);

		for (int i = 0; i < accountary.length; i++) {
			if (accountary[i] == null) {
				accountary[i] = act;
				break;
			}
		}
	}

	// 계좌리스트 조회 메소드
	public static void getAccoutlist() {
		for (Account a : accountary) {
			if (a != null)
				System.out.println("계좌번호 : " + a.getAno() + ", 소유자 : " + a.getOwner() + ", 잔액 : " + a.getBalance());
		}
	}

	// 입금
	public static void deposit() {
		System.out.println("deposit()");
		System.out.println("계좌번호 입력 : ");
		String no = sc.nextLine();
		System.out.println("입금금액 : ");
		int balance = sc.nextInt();
		for (Account a : accountary) {
			if (a != null && a.getAno().equals(no)) {
				a.setBalance(balance);
				System.out.println("총 금액 : " + a.getBalance());
			}
		}
	}

	// 출금
	public static void withdraw() {
		System.out.println("withdraw()");
		System.out.println("계좌번호 입력 : ");
		String no = sc.nextLine();
		System.out.println("출금 금액 : ");
		int balance = sc.nextInt();
		for (Account a : accountary) {
			if (a != null && a.getAno().contentEquals(no)) {
				a.setBalance(balance * -1);
				System.out.println("총 금액 : " + a.getBalance());
			}
		}

	}

	public static Account findAccount(String ano) {
		Account b = null;
		System.out.println("계좌번호 : ");
		ano = sc.nextLine();

		for (Account a : accountary) {
			if (a.getAno().equals(ano))
				System.out.println("계좌번호 : " + a.getAno() + ", 주인 : " + a.getOwner() + ", 잔액 : " + a.getBalance());
			b = a;
		}
		return b;

	}
}
