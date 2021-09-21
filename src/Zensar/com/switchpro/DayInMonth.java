package Zensar.com.switchpro;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter month : ");
	int month =sc.nextInt();
	
	switch(month) {
	
	case 1:
		System.out.println("In January 31 days ");
		break;
	case 2:
		System.out.println("In February 28 days");
		break;
	
	case 3:
		System.out.println("In March 31 days ");
		break;
	case 4:
		System.out.println("In April 30 days ");
		break;
	case 5:
		System.out.println("In May 31 days ");
		break;
	case 6:
		System.out.println("In June 30 days");
		break;
	case 7:
		System.out.println("In July 31 days ");
		break;
	case 8:
		System.out.println("In August 31 days");
		break;
	case 9:
		System.out.println("In september 30 days");
		break;
	case 10:
		System.out.println("In October 31 days");
		break;
	case 11:
		System.out.println("In November 30 days ");
		break;
	case 12:
		System.out.println("In December 31 days");
		break;
	}
    		

	}

}
