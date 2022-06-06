package Pooja;

class Calculator1{
	
	//static method
	static int calculate1(int num1, int num2) { // same name but different datatype
	return num1 * num2;
}
	// static method
	static double calculate1(double num1, double num2) { // same name but different datatype
		return num1 * num2;
		
	}
}
public class OverloadingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator1.calculate1(45, 60));
		System.out.println(Calculator1.calculate1(45.7, 77.9));
		
	}

	}


