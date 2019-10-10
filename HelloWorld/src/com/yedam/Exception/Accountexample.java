package com.yedam.Exception;

class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) { // 입금
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientExceptionExample { // ㅍ출금
		if (balance < money) {
			throw new BalanceInsufficientExceptionExample("잔고부족 : " + (money - balance) + "모자람");
		}
		balance -= money;
	}
}

public class Accountexample {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.deposit(10000);
		System.out.println("예금액 : " + acc.getBalance());

		try {
			acc.withdraw(20000);
		} catch (BalanceInsufficientExceptionExample e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("프종");
	}

}
