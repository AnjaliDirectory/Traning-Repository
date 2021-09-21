package Zensar.com.fin.code.pra;

import java.util.Scanner;

public class DigitContain {

	void arraycontain() {

		int num = 3;

		int[] arra = { 5, 2, 6, 78, 3, 6, 8 };

		for (int i = 0; i < arra.length; i++) {

			if (arra[i] == num) {
				System.out.println("true");
				break;

			}
			System.out.println("false");
		}
	}
	
	void digitContain() {
		int num=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		
		//convert integer to sting
		String s=Integer.toString(number);
		
		if(s.indexOf(""+num)!=-1) {
			System.out.println("number found");
		}else {
			System.out.println("number not found");
		}
		
		
	}

	public static void main(String[] args) {

		DigitContain dc = new DigitContain();
	//dc.arraycontain();
		dc.digitContain();

	}

}
