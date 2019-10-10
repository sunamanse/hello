package hello;

public class Member {
	private String name;
	private String Id;
	private String password;
	private int age;

	public Member() {
	}

	public Member(String name, String Id, int age) {
	
		this.name = name;
		this.Id = Id;
		this.age = age;
	}

	public Member(String name, String Id, String password, int age) {

		this.name = name;
		this.Id = Id;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
