
public class App {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertFirst(3);
		list.insertFirst(7);
		list.insertFirst(4);
		list.insertFirst(8);
		
		list.insertLast(99999);
		
		list.view();
		System.out.println(list.deleteFirst());
		list.view();
		System.out.println(list.deleteLast());
		list.view();

	}

}
