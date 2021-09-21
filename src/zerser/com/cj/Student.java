package zerser.com.cj;

//Assignment-1 & 2 &3 
//display method - 4
//

public class Student {

	 public int id;
	 public String name;
	 public double percentage;
	 
	 public void display() {
		 
		 id=201;
		 name="deera";
		 
		 System.out.println(id);
		 System.out.println(name);
		 
		 
	 }
	 
	 
	 
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPercentage() {
		return percentage;
	}



	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1= new Student();
		Student s2= new Student();
		
		System.out.println(s1.id); //102
		System.out.println(s1.name); //Anjali
		
		s1.id=103;
		s1.name="anjali";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		//System.out.println(s1); hashcode
		//System.out.println(s2); hashcode
       
	    s1.display();
	
	
	
	}

}
