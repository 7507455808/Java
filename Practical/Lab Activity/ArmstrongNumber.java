package Pooja;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int n= sc.nextInt();
		int temp = n;
		int r , sum = 0;
		while(n>0)
		{
			r = n%10;
			n = n/10;
			sum = sum + r*r*r;
		}
		if(temp == sum)
			System.out.println(" Its an Armstrong number");
		else
			System.out.println(" Not an Armstrong number");
		
	}

}
