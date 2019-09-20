package commycomsuna;

public class Personex {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("hong");
		p1.setAge(20);
		p1.setHeight(78.2);
		p1.setWeight(77.7);
		System.out.println("이름은 :" + p1.getName() + 
				p1.getAge() + p1.getHeight() + p1.getWeight());
	}
}
