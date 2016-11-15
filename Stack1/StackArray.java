public class StackArray{
	private int tos;
	private int maxSize;
	private int[] stack;
	
	
	public StackArray(int maxSize){
		this.maxSize = maxSize;
		stack = new int[maxSize];
		tos = -1;
	}
	
	public void push(int data){
		if(isFull()){
			System.out.println("Stack is full");
		}else{
			tos++;
			stack[tos] = data;
		}
	}
	
	public int pop(){
		Integer temp = null;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			temp = stack[tos];
			tos--;
		}
		return temp;
	}
	
	public int peak(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return (Integer) null;
		}
		return stack[tos];
	}
	
	public boolean isEmpty(){
		if(tos == -1){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isFull(){
		if(tos == maxSize){
			return true;
		}else{
			return false;
		}
	}
}