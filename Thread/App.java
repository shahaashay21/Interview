
public class App {

	public static void main(String[] args) throws InterruptedException {
		
		/*Get some of 1 to 100 Using 4 thread and 4 object*/
//		RunnableDemo R1 = new RunnableDemo(1);
//		RunnableDemo R2 = new RunnableDemo(26);
//		RunnableDemo R3 = new RunnableDemo(51);
//		RunnableDemo R4 = new RunnableDemo(76);
//		Thread n1 = new Thread(R1, "First");
//		Thread n2 = new Thread(R2, "Second");
//		Thread n3 = new Thread(R3, "Third");
//		Thread n4 = new Thread(R4, "Fourth");
//		
//		n1.start();
//		n2.start();
//		n3.start();
//		n4.start();
//		
//		n1.join();
//		n2.join();
//		n3.join();
//		n4.join();
//		System.out.println(R1.getTotal()+R2.getTotal()+R3.getTotal()+R4.getTotal());
		
		/*Get some of 1 to 100 Using 4 thread and 1 object*/
//		RunnableDemo R6 = new RunnableDemo();
//		Thread n1 = new Thread(R6, "First");
//		Thread n2 = new Thread(R6, "Second");
//		Thread n3 = new Thread(R6, "Third");
//		Thread n4 = new Thread(R6, "Fourth");
//		
//		n1.start();
//		n2.start();
//		n3.start();
//		n4.start();
//		
//		n1.join();
//		n2.join();
//		n3.join();
//		n4.join();
//		System.out.println(R6.getCount());
		
		RunnableDemo R7 = new RunnableDemo();
		Thread e = new Thread(R7, "Even");
		Thread o = new Thread(R7, "Odd");
		
		e.start();
		o.start();
		
		
		
		
		/*Using Synchronization and without it*/
//		RunnableDemo R5 = new RunnableDemo();
//		Thread t1 = new Thread(R5,"First");
//		Thread t2 = new Thread(R5,"Second");
//		
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//		System.out.println(R5.getCount());

	}

}
