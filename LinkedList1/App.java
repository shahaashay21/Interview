
public class App {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.inserFirst(2);
		list.inserFirst(5);
		list.inserFirst(3);
		list.inserFirst(8);
		list.insertAtEnd(99);
		list.insertAtEnd(99999);
		
		
		
//		list.deleteFirst();
//		System.out.println(list.deleteLast().getData());
		System.out.println(list.view());
		System.out.println(list.deleteAtPos(2));
		System.out.println(list.view());
		list.insertAtPos(123, 3);
		System.out.println(list.view());
		list.reverse();
		System.out.println(list.view());

	}

}
