package Zensar.com.containment;

public class PersonVehicleMain {

	public static void main(String[] args) {
		

		
				Vehicle vehicle = new Vehicle(1001, "Hero");
				Person person = new Person(101, "Jay", vehicle);

				System.out.println("Person ID: " + person.id);
				System.out.println("Person Name: " + person.name);
				System.out.println("------------Vehicle Details----------");
				System.out.println("Vehicle Id: " + person.vehicle.vid);
				System.out.println("Vehicle Name: " + person.vehicle.vname);

				// getter & setter
				Person person2 = new Person();
				person2.setId(102);
				person2.setName("Yash");

				person2.vehicle = new Vehicle();

				person2.vehicle.setVid(105);
				person2.vehicle.setVname("auto");

				System.out.println(person2.getId());
				System.out.println(person2.getName());
				System.out.println(person2.getVehicle().getVid());
				System.out.println(person2.getVehicle().getVname());

			}
		

}


