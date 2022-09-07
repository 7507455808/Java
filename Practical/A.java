package java8;

@FunctionalInterface

public interface A {
	
	//abstract method
	public void abc(int a);
	
	// abstract method
	// public void pqr();
	
	//default interface method
	public default void display() {
		System.out.println("i am default ");
	}
	// static interface method	
	public static void def() {
		System.out.println("I am static ");
	}
	
	}
	
	class Demo implements A{

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display(); // calling default interface method
		d.abc(10);
		A.def(); //calling static interface method
	}
	
	// without lambda expression
	public void abc(int a) {
		System.out.println("I am abstract ");
	}

	}
