package Test;

public class GymMember {
	String name;
	int MemNo;
	String major;

	
	
	public GymMember(String name, int memNo, String major) {
		super();
		this.name = name;
		MemNo = memNo;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemNo() {
		return MemNo;
	}

	public void setMemNo(int memNo) {
		MemNo = memNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
