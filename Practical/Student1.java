//See the example programme for Java constructor overloading below.
//Write the same programme to showcase constructor overloading for two students named Ram and Ratan,
//who have student IDs 16 and 17, and ages 42 and 27, respectively.
//Show the resulting output.



package Pooja;

public class Student1 {
	int id;
	String name;
	int age;
	
	Student1(int i,String n){
		
		id=i;
		name=n;
		
	}
	Student1(int i,String n,int a){
		
		id=i;
		name=n;
		age=a;
		
	}
	void display() {
		
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		

		Student1 s1=new Student1(16,"Ram",42);
		Student1 s2=new Student1(17,"Ratan",27);
		
		s1.display();
		s2.display();
		
	}

}
