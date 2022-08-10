package ThreadEg;

public class UseThreadClass extends Thread{
	
	public void run() {
		//  System.out.println(" I am Thread ");
		
		for(int i=1;i<=10;i=i+2) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		
		UseThreadClass u = new UseThreadClass();
		u.start();
		UseThreadClass u1 = new UseThreadClass();
		u1.start();

	}

}
