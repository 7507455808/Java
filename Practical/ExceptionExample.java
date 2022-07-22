package Pooja;

public class ExceptionExample {
	public void calculatePerUnit() {
		int qty = 20, rate = 10000, punit = 0;
		try {
			punit = rate/qty; // may exception arise
		}
		catch(Exception e) {
		//	System.out.println("product quantity cannot be zero....");
			System.out.println(e);
		}
		System.out.println("per unit price is : "+punit);
		
		
	}

	public static void main(String[] args) {
		
		ExceptionExample obj = new ExceptionExample();
		obj.calculatePerUnit();
		

	}

}
