package hello;

public class student {
	private int Num;
	private String name;
	private int KorScore;
	private int EngScore;
	private int MathScore;
	
	
	public student (int Num, String name, int KorScore, int engScore, int MathScore) {

		this.Num = Num;
		this.name = name;
		this.KorScore = KorScore;
		this.EngScore = engScore;	
		this.MathScore = MathScore;
	
	}
	
	
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorScore() {
		return KorScore;
	}
	public void setKorScore(int korScore) {
		KorScore = korScore;
	}
	public int getEngScore() {
		return EngScore;
	}
	public void setEngScore(int engScore) {
		EngScore = engScore;
	}
	public int getMathScore() {
		return MathScore;
	}
	public void setMathScore(int mathScore) {
		MathScore = mathScore;
	}


	public static void parallelSort(student[] stuary) {
		
		
	}
	
	 

}
