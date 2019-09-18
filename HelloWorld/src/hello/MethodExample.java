package hello;

public class MethodExample {
	public static void main(String[] args) {
		
		int[] aru = {2,4,5,3,6}	;	
		int sum = 0;
		sum=sum2(aru);
				
			System.out.println("hap :"+ sum);
	}
		

			
		//int a = 24;
		//System.out.println(args[0]);
		//showName();
	//	showAge(a);
		//showMe(21.3, 2324.45);

		int sum1 = sum(4, 5);
		int min = minus(10, 2);
		int mul = multi(4, 5);
		int div = diva(10, 2);
		int result = sum1 + mul;
		
		//double weight = mom(168);
		
		//System.out.println("ddd" + weight);
		//System.out.println("결과값:" + result);
		//System.out.println(args[1]);

	} public static int sum2(int[] aru) {
		int sum=0;
		for (int i =0; i<aru.length; i++) {
			sum+= aru[i];
		}
	}
	
	
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int minus(int a, int b) {
		return a - b;
	}
	public static int multi(int z, int y) {
		return z * y;
	}
	public static int diva(int t, int w) {
		return t / w;
	}

	public static double mom(double height) {
		return (height-100) *0.9;
	}
	
	
	public static void showMe(double height, double weight) {
		System.out.println("i am" + height + " cm and" + weight + "kg");
	}

	public static void showAge(int age) {
		System.out.println("i am " + age + " years old");
	}

	public static void showName() {
		System.out.println("Hello, my name is suna");
	}

}
