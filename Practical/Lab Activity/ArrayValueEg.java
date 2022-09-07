package Lab;

public class ArrayValueEg {

	public static void main(String[] args) {
		int[] myArray = {40,60,75,35};
		int num = 40;
		
		for(int i =0; i<myArray.length; i++) {
			if(num == myArray[i]) {
				System.out.println("Array contains the given element");
				
			}
		}

	}

}
