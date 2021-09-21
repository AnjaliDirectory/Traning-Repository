package Zensar.com.containment;

public class Person {

	public int id;
	public String name;
	public Vehicle vehicle;
	//public Object vehicle;

	public Person(int id, String name, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
public Person() {
	// TODO Auto-generated constructor stub
}
   

	
}
