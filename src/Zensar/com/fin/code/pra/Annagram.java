package Zensar.com.fin.code.pra;
//final code (4)
import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	String s1;
	String s2;
	boolean flag = true;

	public Annagram() {
		// TODO Auto-generated constructor stub
	}

	void annagram() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string: ");
		s1 = sc.next();

		System.out.println("enter second string: ");
		s2 = sc.next();

		if (s1.length() == s2.length()) {
			char[] chararray1 = s1.toCharArray();
			char[] chararray2 = s2.toCharArray();

			Arrays.sort(chararray1);
			Arrays.sort(chararray2);

			boolean result = Arrays.equals(chararray1, chararray2);

			if (result) {
				System.out.println(s1 + " and " + s2 + "are anagram");
			} else {
				System.out.println(s1 + " and " + s2 + "are not anagram");
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annagram ann = new Annagram();
		ann.annagram();

	}

}
