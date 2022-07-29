package Pooja;

public class TestException {
	
	//method to check age
	public void checkAge(int age) throws AgeException{
		if(age>25) {
			throw new AgeException("you are not eligible for this CG Java course"); //throw
			
		}
		else {
			System.out.println("you are eligible for CG Java course");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestException t = new TestException();
		try {
			t.checkAge(26);
		}
		catch (AgeException e) {
			System.out.println(e);
		}

	}

}
