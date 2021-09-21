package Zensar.com.fin.code.pra;

import java.util.Scanner;

public class Occurence_String {

	static int occ_String() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();

		System.out.println("enter occurence word");
		String word = sc.next();

		String arr[] = s1.split(" ");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (word.equals(arr[i])) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Occurence_String os = new Occurence_String();
		os.occ_String();

	}

}
