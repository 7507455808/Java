package Pooja;

import java.util.Scanner;

class Calculator{
	
	// static method with two argument
	static int calculate(int num1,int num2) { // same name but different argument
		return num1 * num2;
		
	}
	// static method with 3 argument
	static int calculate(int num1, int num2, int num3) { //same name but different argument
		return num1 * num2 * num3;
		
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
// user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = s.nextInt();
		System.out.println("Enter num2");
		int num2 = s.nextInt();
		System.out.println("Enter num3");
		int num3 = s.nextInt();
		
		System.out.println("Multiplication of two number is : " + Calculator.calculate(num1, num2)); // calling method with two argument
		System.out.println("Multiplication of two number is : " + Calculator.calculate(num1, num2, num3)); //calling method with three argument
	}

}
