package Zensar.com.switchpro;

import java.util.Scanner;

public class DayDisplay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("day is 1 exist in a week");
			break;
		case 2:
			System.out.println("day is 2 exist in a week");
			break;
		case 3:
			System.out.println("day 3 exist");
			break;
		case 4:
			System.out.println("day 4 exist");
			break;
		case 5:
			System.out.println("day 5 exist");
			break;
		case 6:
			System.out.println("day 6 exist");
			break;
		case 7:
			System.out.println("day 7 exist");
			break;
		case 8:
			System.out.println("dau 8");
			break;
			
		default: 
			System.out.println("error, day not exist");
		}
		

	}

}
