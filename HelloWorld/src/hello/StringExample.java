package hello;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "Nice"; // int , short, long 다름
		String str2 = "Nice";
		
		if(str1 == str2) {
			System.out.println("동일한 참조값.");
		}else {
			System.out.println("다른 참조값");
		}
		
		String str3 = new String("Nice");
		String str4 = new String("Nice");
		if(str3. equals (str4) ) {
			System.out.println("동일참조");
		}else {
			System.out.println("다른참조");
		}
	}

}
