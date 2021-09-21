package zerser.com.cj;

public abstract class Teacher {

	public int tId;
	public String tName;
	public long tMobile;
	int salary;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int tId, String tName, int tMobile) {
		// TODO Auto-generated constructor stub
		System.out.println("parameterized constructor");
		System.out.println("tId: " + tId + " tName: " + tName + " tMobile: " + tMobile);
	}

	abstract void salary();

}
