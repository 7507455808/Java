package java8;

 class Demo1 {

	public static void main(String[] args) {
		
		//interface with lambda expression
		A al = (a) ->{
			System.out.println("Functional interface with lambda expression");
			System.out.println(a);
			
		};
		al.abc(10);

	}

}
