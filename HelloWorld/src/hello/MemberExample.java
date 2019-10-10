package hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		
	
	Member m1 = new Member();
	m1.setName("suna");
	m1.setId("id");
	m1.setPassword("pass");
	m1.setAge(24);
	
	
	Member m2 = new Member("관리자","admin");

	m2.setPassword("admin");
	m2.setAge(20);
	
	Member m3 = new Member("사용자1" , "user1","user1",10);
	
	Member[] memary = {m1, m2, m3};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("조회할 name :");
	String name = sc.nextLine();
	
	
	for(Member m :memary){
		if(m.getName().equals(name))
		System.out.println("name : " + m.getName() + ", id : " 
	+ m.getId() + ", pswd : " + m.getPassword() + 
	", age : " + m.getAge());
		
	}
	
	
	
	}
	
}
