package Pooja;
//parent class

class Reversebank{
	
	int getrateOfInterest() {
		return 0;
	}
}
//child class
class Icici extends Reversebank{
	
	//overriding parent method
	int getRateOfInterest() {
		return 7;
	}
}
// child class
class Axis extends Reversebank{
	
	int getRateOfInterest() {
		return 8;
	}
		
	}
	


public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici c = new Icici(); //create object to call method
		System.out.println("Rate of Interest for ICICI : " +c.getRateOfInterest()); //invoke method
		
		Axis a = new Axis();
		System.out.println("Rate of Interest for Axis : " +a.getRateOfInterest());
		

	}

}
