package Zensar.com.Collection;

public class StudentData implements Comparable<StudentData>{

	 public int sid;
	 public String sname;
	 public int age;
	 
	 
	 public StudentData() {
		// TODO Auto-generated constructor stub
	}
	 
	public StudentData(int sid, String sname, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}

	@Override
	public int compareTo(StudentData sd) {
		// TODO Auto-generated method stub
		return 0;
	};
	 
	
	 
	
	
	
}
