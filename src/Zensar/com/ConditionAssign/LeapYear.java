package Zensar.com.ConditionAssign;

import java.util.Scanner;

public class LeapYear{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter year :");
		int year=sc.nextInt();
		
		if(year%400==0) {
			System.out.println(year+ " leap year");
		}else if(year%100==0) {
			System.out.println(year+ " leap year");
		}else if(year%4==0) {
			System.out.println(year+ " leap year");
		}else {
			System.out.println(year+ " not a leap year");
		}

	}

}
