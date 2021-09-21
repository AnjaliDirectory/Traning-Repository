package Zensar.com.switchpro;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int num = sc.nextInt();
		
		switch(num%2) {
		
		case 0:
			System.out.println(num + " is even number");
			break;
			
		case 1:
		     System.out.println(num + " is odd number");
		     break;
		}

	}

}
