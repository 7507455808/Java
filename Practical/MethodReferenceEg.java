package java8;

interface show{
	void hi();
}

public class MethodReferenceEg {
	
	public static void add() {
		System.out.println("I am addition method");
	}

	public static void main(String[] args) {
		
		// lambda
		show obj = () ->{
			System.out.println("I am show...........");
		};
		// calling interface method
		obj.hi();
		
		// referring static add()
		
		show obj1 = MethodReferenceEg::add;

	}

}
