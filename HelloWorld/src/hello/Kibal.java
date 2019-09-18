package hello;

public class Kibal {
	public static void main(String[] args) {
		double weight = mom(164.8);

		System.out.println("몸무게 :" + weight);
	}

	public static double mom (double hight) {
		return(hight -100) *0.9;
	
	}

}