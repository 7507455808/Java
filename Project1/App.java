package com.sprint1project;

import java.util.Scanner;

import com.sprint1project.daoimpl.DoctorDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
    	DoctorDaoImpl ddao = new DoctorDaoImpl();
    	char a;
    	do {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("-------Doctor Registration System-----");
    		System.out.println("enter your choice");
    		System.out.print("1. Add \n 2. Read \n 3. Update \n 4. Delete \n 5. Exit");
    		int ch = sc.nextInt();
			switch(ch) {
    		case 1: ddao.addDoctorBy();
    		break;
    		
    		case 2: ddao.getDoctorBy();
    		break;
    		
    		case 3: ddao.updateDoctor();
    		break;
    		
    		case 4: ddao.deleteDoctor();
    		break;
    		
    		case 5: System.exit(0);
    		break;
    		default : System.out.println("invalid choice");
    		
    		}
    		System.out.println("Do you want to continue ? Y/N");
    		a = sc.next().charAt(0);
    	}
    	while(a == 'Y'| a == 'y');
    	System.out.println("Thank you----------");
    	

    }
}
