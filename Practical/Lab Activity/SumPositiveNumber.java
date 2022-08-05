package Lab;

import java.util.Scanner;

public class SumPositiveNumber {

	public static void main(String[] args) {
		
		int num,sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number(Negative Number to Quit):");
		while(true)
		{
			num = input.nextInt(); //read number
			if(num<0)
				break;
			sum+=num;
		}
		System.out.println("Sum is : "+sum);

	}

}
