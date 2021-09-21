package zerser.com.cj;

public class EmployeeDetails {

	private int empId;
	private String empName;
	private double salary;

	public EmployeeDetails() {
		System.out.println("i am default condtructor");
	}

	public EmployeeDetails(int empId, String empName, double salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		System.out.println("i am parameterized constructor");
		System.out.println("empId : " + empId + "\nname: " + empName + " \nsalary : " + salary);

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails empd = new EmployeeDetails();
		EmployeeDetails empd2 = new EmployeeDetails(101, "Anjali", 30000);
		//EmployeeDetails empd3 = new EmployeeDetails();
	}

}
