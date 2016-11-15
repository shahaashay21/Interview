import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class SinglyLinkedList {
	private Node head;
	private Node last;
	
	public SinglyLinkedList(){
		head = null;
		last = null;
	}
	
	public void inserFirst(Object data){
		Node newNode = new Node(data, head);
		if(isEmpty()){
			last = newNode;
		}
		head = newNode;
	}
	
	public void insertAtEnd(Object data){
		Node newNode = new Node(data, null);
		if(isEmpty()){
			head = newNode;
		}else{
			last.setNext(newNode);
			last = newNode;
		}
	}
	public Node deleteFirst(){
		if(isEmpty()){
			System.out.println("Node is already empty");
			return null;
		}else{
			if(head.getNext() == null){
				last = null;
			}
			Node temp = head;
			head = head.getNext();
			return temp;
		} 
	}
	
	public Node deleteLast(){
		Node temp = head;
		Node returnData;
		if(isEmpty()){
			System.out.println("Node is already empty");
			return null;
		}else{
			while(temp.getNext().getNext() != null){
				temp = temp.getNext();
			}
			returnData = temp.getNext();
			temp.setNext(null);
		}
		return returnData;
	}
	
	public Object deleteAtPos(int pos){
		Node temp = head;
		int deleteNodeData;
		if(isEmpty()){
			System.out.println("Node is already empty");
			return null;
		}else{
			if(pos == 1){
				deleteNodeData = (int) head.getData();
				head = head.getNext();
				return deleteNodeData;
			}else{
				int loopCounter = 1;
				while(loopCounter < pos-1){
					if(temp == null){
						return null;
					}
					temp = temp.getNext();
					loopCounter++;
				}
				Node deleteTemp = temp.getNext();
				if(deleteTemp == null){
					return null;
				}else{
					deleteNodeData = (int) temp.getNext().getData();
					temp.setNext(temp.getNext().getNext());
					return deleteNodeData;
				}
			}
		}
	}
	
	public void insertAtPos(Object data, int pos){
		int loopCounter = 1;
		Node temp = head;
		if(pos == 1){
			Node newNode = new Node(data, head);
			head = newNode;
		}
		while(loopCounter < pos-1){
			if(temp.getNext() == null){
				System.out.println("No position");
				return;
			}
			temp = temp.getNext();
			loopCounter++;
		}
		System.out.println("Added at pos: "+ pos +" and Value: "+ data);
		Node newNode = new Node(data, temp.getNext());
		temp.setNext(newNode);
	}
	
	
	public void reverse(){
		Node prev = null;
		Node next;
		Node current = head;
		while(current != null){
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	
	public String view(){
		Node temp = head;
		String result = "[";
		while(temp!= null){
			result = result + temp.getData()+" ";
			temp = temp.getNext();
		}
		result = result+ "]";
		return result;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
}
