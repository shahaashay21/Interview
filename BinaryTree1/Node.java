
public class Node {
	private Object data;
	private Node left;
	private Node right;
	
	public Node(Object data, Node next, Node previous){
		this.data = data;
		this.left = next;
		this.right = previous;
	}
	
	public void setData(Object data){
		this.data = data;
	}
	
	public Object getData(){
		return this.data;
	}
	
	public void setLeft(Node next){
		this.left = next;
	}
	
	public Node getLeft(){
		return this.left;
	}

	public void setRight(Node previous) {
		this.right = previous;
	}
	
	public Node getRight() {
		return right;
	}
}
