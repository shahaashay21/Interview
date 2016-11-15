import java.util.Stack;

public class BinaryTree {
	private Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	public void insert(Object data){
		root = insert(data, this.root);
	}
	
	public Node insert(Object data, Node node){
		if(node != null){
			if((Integer) node.getData() > (Integer) data){
				node.setLeft(insert(data, node.getLeft()));
			}else if((Integer) node.getData() < (Integer) data){
				node.setRight(insert(data, node.getRight()));
			}else{
				System.out.println("Same Value");
			}
		}else{
			return(new Node(data, null, null));
		}
		return node;
	}
	
	
	public Node findNode(Object data){
		Node temp = this.root;
		boolean found = false;
		while(temp != null){
			if((Integer) temp.getData() > (Integer) data){
				temp = temp.getLeft();
			}else if((Integer) temp.getData() < (Integer) data){
				temp = temp.getRight();
			}else{
				found = true;
				break;
			}
		}
		if(found){
			return temp;
		}else{
			return null;
		}
	}
	
	public void delete(Object data){
		delete(data, this.root);
	}
	
	public Node delete(Object data, Node node){
		if(node == null){
			return null;
		}
		if(node.getData() == data){
			if(node.getLeft() == null && node.getRight() == null){
				node = null;
			}else if(node.getLeft() != null && node.getRight() == null){
				node = node.getLeft();
			}else if(node.getLeft() == null && node.getRight() != null){
				node = node.getRight();
			}else{
				node.setData(findMin(node.getRight()).getData());
				delete(findMin(node.getRight()).getData(), node.getRight());
			}
		}else{
			if((Integer) node.getData() > (Integer) data){
				node.setLeft(delete(data, node.getLeft()));
			}else{
				node.setRight(delete(data, node.getRight()));
			}
		}
		return node;
	}
	
	public Node findMin(){
		return(findMin(this.root));
	}
	
	public Node findMin(Node node){
		Node temp = node;
		while(temp.getLeft() != null){
			temp = temp.getLeft();
		}
		return temp;
	}
	
	
	public void inorder(){
		inorder(this.root);
	}
	
	//With Recursion
	public void inorder(Node node){
		if(node == null){
			return;
		}else{
			inorder(node.getLeft());
			System.out.println(node.getData());
			inorder(node.getRight());
		}
	}
	
	//Without Recursion
//	public void inorder(Node node){
//		Stack<Node> stack = new Stack<Node>();
//		
//		while(node != null || !stack.isEmpty()){
//			if(node != null){
//				stack.push(node);
//				node = node.getLeft();
//			}else{
//				Node temp = stack.pop();
//				System.out.println(temp.getData());
//				node = temp.getRight();
//			}
//		}
//	}
	

}