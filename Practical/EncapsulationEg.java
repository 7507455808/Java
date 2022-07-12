package Pooja;

import java.util.Scanner;

public class EncapsulationEg {
	
	public static void main(String[] args) {
		
		StudentEg s = new StudentEg(); //object creation for accsssing variables
		
		//s.setId(101); // putting values using set()
		//s.setsName("Pooja");
		//s.setsEmail("pooja@gmail.com");
	//s.setsPhone(98765432);
		
		//Scanner class to take value from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		s.setId(id);
		
		System.out.println("Enter Name");
		String n = sc.next();
		s.setsName(n);
		
		sc.nextLine();
		System.out.println("Enter Phone");
		long ph = sc.nextLong();
		s.setsPhone(ph);
		
		System.out.println("Enter email");
		String e = sc.next();
		s.setsEmail(e);
		
		
		System.out.println("-------------Student Details---------");
		
		System.out.println("Id is :" + s.getId()); //fetch value using get()
		System.out.println("Name is :" + s.getsName());
		System.out.println("Phone is :" + s.getsPhone());
		System.out.println("Email is :" + s.getsEmail());
		


	}

}
