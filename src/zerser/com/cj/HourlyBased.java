package zerser.com.cj;

public class HourlyBased extends Teacher {

	public int rate_per_hr;
	int hrs;

	public HourlyBased() {
		// TODO Auto-generated constructor stub
	}

	public HourlyBased(int tId, String tName, int tMobile, int rate_per_hr, int hrs) {
		super(tId, tName, tMobile);
		this.rate_per_hr = rate_per_hr;
		this.hrs = hrs;
		System.out.println("rate_per_hrs: " + rate_per_hr + " hrs: " + hrs);
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("==== salary =====");
		int sal = rate_per_hr * hrs;
		System.out.println("salary = " + sal);

	}

	public void hrBased() {

		System.out.println("hourly based teacher");
	}

	public static void main(String[] args) {
		HourlyBased hrb = new HourlyBased();
		HourlyBased hrb1 = new HourlyBased(101, "rushi", 567835234, 400, 4);
	}

}
