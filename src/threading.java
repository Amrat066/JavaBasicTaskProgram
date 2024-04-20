
public class threading extends Thread {
	
	static int counter=0;
	 public void run() {
		System.out.println("running");
		
		for(int i=0;i<100;i++) {
			counter++;
		}
	}

	
	public static void main(String args[]) {
			threading t=new threading();
			threading t2=new threading();
			
			t.run();
			t.setName("ama");
			System.out.println(t);
			System.out.println(t.counter);
	}

}
