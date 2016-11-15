
public class DoublyLinkedList {
	private Node head;
	private Node tail;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insertFirst(Object data){
		if(isEmpty()){
			Node newNode = new Node(data, null, null);
			head = tail = newNode;
		}else{
			Node newNode = new Node(data, head, null);
			head.setPrevious(newNode);
			head = newNode;
		}
	}
	
	public void insertLast(Object data){
		if(isEmpty()){
			Node newNode = new Node(data, null, null);
			head = tail = newNode;
		}else{
			Node newNode = new Node(data, null, tail);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public Object deleteFirst(){
		Object returnData;
		if(isEmpty()){
			System.out.println("List is empty");
			return null;
		}else{
			returnData = head.getData();
			if(head.getNext() == null){
				head = tail = null;
			}else{
				Node temp = head.getNext();
				temp.setPrevious(null);
				head = temp;
			}
		}
		return returnData;
	}
	
	public Object deleteLast(){
		Object returnData;
		if(isEmpty()){
			System.out.println("List is empty");
			return null;
		}else{
			if(head.getNext() == null){
				returnData = head.getData();
				head = tail = null;
			}else{
				returnData = tail.getData();
				tail.getPrevious().setNext(null);
				tail = tail.getPrevious();
			}
		}
		return returnData;
	}
	
	public void insertAtPos(Object data, int pos){
		int loopCounter = 1;
		if(isEmpty()){
			System.out.println("Node is already empty");
		}else{
			if(pos == 1){
				Node newNode = new Node(data, head, null);
				head = newNode;
			}
			while(loopCounter < pos-1){
				
			}
		}
	}
	
	public void view(){
		Node temp = head;
		System.out.print("[ ");
		while(temp != null){
			System.out.print(temp.getData()+ " ");
			temp = temp.getNext();
		}
		System.out.println("]");
	}
	
	
}
