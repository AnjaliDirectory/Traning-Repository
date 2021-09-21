package zerser.com.cj;
//Assignment3 (6)
import java.util.Scanner;

public class Account_Info {

	private long acc_No;
	public String customer_name;
	public double amount;
	public double balance;

	Account_Info() {
		acc_No = 23456;
		customer_name = "Annu";
		amount = 2000;

		System.out.println("Account info :\n");
		// System.out.println("Account_no:" + acc_No + " holder name :" + customer_name
		// + " Amount:" + amount );
		System.out.println("I AM DEFAULT CONSTRUCTOR.");
	}

	Account_Info(long acc_No, String customer_name, double amount) {

		System.out.println("I AM PARAMERTISED CONDT ");
		System.out.println("Account_no:" + acc_No + " customer_name :" + customer_name + " Amount:" + amount);

	}

	public void Insert() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter account no: ");
		int acc_No = sc.nextInt();
		

		System.out.println("enter customer name: ");
		String customer_name = sc.next();
		
		System.out.println("enter amount: ");
		Double amount = sc.nextDouble();
		double balance=amount;
		
		System.out.println("Account no:"+acc_No);
		System.out.println("name:"+customer_name);
		System.out.println("total amount:"+balance);
		

	}

	public void display() {
           
		Insert();
	}
	
	public void deposit(int amt) {
		
		double balance=this.balance+amt;
		System.out.println(balance);
		
	}

	public void withdraw(int amt) {

		double balance = this.balance - amt;
		System.out.println(balance);

	}

	public static void main(String agrs[]) {

		Account_Info AI = new Account_Info();
		Account_Info AI1 = new Account_Info(12345, "suresh", 10000);
		//AI.Insert();
		AI.display();
		AI.deposit(5000);
		AI.withdraw(5000);

	}

}
