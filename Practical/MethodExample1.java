package Pooja;

public class MethodExample1 {
	// parameter method
	static double add(double num1, double num2) {
		double sum = num1+ num2;
	 	return sum; // returning sum
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = 60.88;
		double n2 = 76.23;
		double result = add(n1,n2); // calling method
		System.out.println("Addtion is : " + result);
		
		

	}

}
