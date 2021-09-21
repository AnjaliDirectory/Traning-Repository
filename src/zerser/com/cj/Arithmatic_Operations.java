package zerser.com.cj;

//Assignment - 7

public class Arithmatic_Operations {

	public int number1;
	public int number2;
	public int result;

	public int add(int number1, int number2) {
		System.out.println(result);
		return (result=number1 + number2);

	}

	public int sub(int number1, int number2) {
		System.out.println(result);
		return (result=number1 - number2);
	}

	public int multiply(int number1, int number2) {
		System.out.println(result);
		return (result=number1 * number2);
	}

	public int divide(int number1, int number2) {
		System.out.println(result);
		return (result=number1/number2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatic_Operations Ap = new Arithmatic_Operations();
		Ap.add(10, 20);
		Ap.sub(20, 10);
		Ap.multiply(10, 20);
		Ap.divide(20, 10);
		System.out.println("success");

	}

}
