package ThreadEg;

public class SequentialExample {
	
	public void run() {
		for(int i=1;i<10;i++) {
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		SequentialExample s = new SequentialExample();
		SequentialExample s1 = new SequentialExample();
		
		s.run();
		s.run();
		

	}

}
