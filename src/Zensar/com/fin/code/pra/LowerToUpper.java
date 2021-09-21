package Zensar.com.fin.code.pra;

import java.util.Scanner;

public class LowerToUpper {

	void changeCase() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String s1 = sc.next();

		String str = "";
		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch += 32;
			} else if (ch >= 'a' && ch <= 'z') {
				ch -= 32;

			}
			str = str + ch;

		}
		System.out.println(str);

	}

	public static void main(String[] args) {
		LowerToUpper lou = new LowerToUpper();
		lou.changeCase();

	}

}
