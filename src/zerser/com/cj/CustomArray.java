package zerser.com.cj;

import java.util.Scanner;

public class CustomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Student[] arr=new Student[5];
        
        Student s1= new Student();
        
        for(int i=0;i<arr.length;i++) {
        	
        	arr[i]=new Student();
        	
        	System.out.println("enter id, name, percentage");
        	arr[i].setId(sc.nextInt());
        	arr[i].setName(sc.next());
        	arr[i].setPercentage(sc.nextDouble());
        	
        	
        }
        
        for(int i=0; i<arr.length; i++) {
        	
        	if(arr[i].getPercentage()>75) {
        		System.out.println(arr[i].getName());
        		System.out.println("all are greter than 75 percent");
        	}
        	else {
        		System.out.println("percentage less than 75");
        	}
        }
         
	}

}
