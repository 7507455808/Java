package Pooja;

public class Student {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

		int id;
		String name;
		int age;
		Student(int i,String n)
		{
			id=i;
			name=n;
		
		
		}
		
	
	Student(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
		
		
	}
	public static void main(String args[]) {
		Student s1=new Student(20,"Alex");
		Student s2=new Student(21,"Bill",50);
		s1.display();
		s2.display();
		
	}
		
		
	}

