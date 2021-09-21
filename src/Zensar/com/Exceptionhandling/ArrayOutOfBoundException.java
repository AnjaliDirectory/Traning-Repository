package Zensar.com.Exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutOfBoundException{
	public static void main(String[] args) {
		
	
	
	try {
	int[] arr= {12,34,66,44,89,57}; 
	Scanner sc= new Scanner(System.in);
	System.out.println(arr);
	System.out.println(Arrays.toString(arr));
	//System.out.println(result);
	System.out.println("enter index which wnat to search:");
	int index=sc.nextInt();
	System.out.println(arr[index]);
	}
	catch(ArrayIndexOutOfBoundsException AE) {
		System.out.println(" array size is 5 please enter less than 5 index, its giving error ");
		//AE.printStackTrace();
		
		
	}
  
	
	
	
	
	}

}
