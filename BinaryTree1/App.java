
public class App {

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		
		b.insert(4);
		b.insert(3);
		b.insert(8);
		b.insert(12);
		b.insert(1);
		b.insert(14);
		b.insert(6);
		b.insert(9);
		b.insert(10);
		
		b.inorder();
		System.out.println("Min number: "+b.findMin().getData());
		
//		Node found = b.findNode(7);
//		if(found != null){
//			System.out.println("Found Node: "+ found.getData());
//		}else{
//			System.out.println("Data is not available");
//		}
		
		b.delete(8);
		b.inorder();
	}

}
