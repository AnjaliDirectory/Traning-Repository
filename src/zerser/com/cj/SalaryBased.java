package zerser.com.cj;

public class SalaryBased extends HourlyBased {

	public int salary;

	public SalaryBased() {
		// TODO Auto-generated constructor stub
	}

	public SalaryBased(int salary) {
		super();
		this.salary = salary;
	}

	void salary(int rate_per_hr, int hrs) {
		System.out.println();
		System.out.println("==== salary =====");
		int sal = rate_per_hr * hrs;
		System.out.println("salary = " + sal);

	}

	public static void main(String[] args) {

		SalaryBased sal = new SalaryBased();

		sal.salary(400, 4);
	}
}
