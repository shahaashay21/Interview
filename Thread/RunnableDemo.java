class RunnableDemo implements Runnable {
	private int total = 0;
	int start;
	private int count = 0;
	private int number = 1;
	
	public RunnableDemo(){
	}
	public RunnableDemo(int start){
		this.start = start;
	}
	public void run(){
		/*Get some of 1 to 100 Using 4 thread and 4 object*/
//		try{
//			totalSum();
//			Thread.sleep(100);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		
		/*Get some of 1 to 100 Using 4 thread and 1 object*/
//		try{
//			int i;
//			if(Thread.currentThread().getName().equals("First")){
//				i = 1;
//			}else if(Thread.currentThread().getName().equals("Second")){
//				i = 2;
//			}else if(Thread.currentThread().getName().equals("Third")){
//				i = 3;
//			}else{
//				i = 4;
//			}
//			synchronized(this){
//				int tempCount = 1;
//				while(tempCount <= 25 && i <= 100){
//					System.out.println(Thread.currentThread().getName());
//					count += i;
//					tempCount++;
//					i+=4;
//					Thread.sleep(1);
//				}
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		
		/*Using Synchronization and without it*/
//		try{
//			synchronized(this){
//				for(int i=0; i<5; i++){
//					System.out.println(Thread.currentThread().getName()+" with "+count);
//					Thread.sleep(100);
//					count++;
//				}
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
		
		try{
			synchronized(this){
				while(number <= 25){
					System.out.println(Thread.currentThread().getName()+" : "+ number);
					number++;
					Thread.sleep(1);
//					wait();
					notify();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		try{
			synchronized(this){
				while(number <= 25){
					System.out.println(Thread.currentThread().getName()+" : "+ number);
					number++;
					Thread.sleep(1);
					wait();
					notify();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public int getCount(){
		return count;
	}
	
	/*Get some of 1 to 100 Using 4 thread and 4 object*/
	public void totalSum(){
		try{
			int end = start+25;
			for(; start<end; start++){
				System.out.println("Current thread: "+Thread.currentThread().getName()+" ON: "+start);
				total += start;
				Thread.sleep(10);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public int getTotal(){
		return total;
	}
}