package stringhandling;

public class string {
	
	public static void main(String[] args)
	{
		//String s2= hari; // error without double quotes
		String s1= "java is a programming languange"; 
		String s3= "hk";
		String ss = new String("hari");
		System.out.println(s1==s3); //data
		System.out.println(s3.equals(ss));
		
		System.out.println(s1.concat(s3));
		
		System.out.println(ss.split(s1));
		
	}

}
