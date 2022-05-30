package Pooja;

import java.util.Scanner;

public class ScannerExample {
	// static parameter method
	static void find(int num) {
		
		if(num%2 ==0) {
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //creating scanner object
		System.out.println("Enter number");
		int num = sc.nextInt(); // reading value from user
		
		find(num); // method calling
		
		

	}

}
