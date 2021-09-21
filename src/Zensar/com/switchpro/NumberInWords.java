package Zensar.com.switchpro;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number which want chnage in word : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 0: 
			System.out.println("ZERO");
			break;
		case 1: 
			System.out.println("ONE");
			break;
		case 2: 
			System.out.println("TWO");
			break;
		case 3: 
			System.out.println("THREE");
			break;
		case 4: 
			System.out.println("ZERO");
			break;
		case 5: 
			System.out.println("FOUR");
			break;
		case 6: 
			System.out.println("FIVE");
			break;
		case 7: 
			System.out.println("SIX");
			break;
		case 8: 
			System.out.println("SEVEN");
			break;
		}

	}

}
