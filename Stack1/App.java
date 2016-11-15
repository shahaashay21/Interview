public class App {

	public static void main(String[] args) {
		StackList s = new StackList();
		
		s.push(3);
		s.push(6);
		s.push(4);
		s.push(9);
		s.push(1);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peak());
		System.out.println(s.peak());
		
		System.out.println("--------------");
		
		
		StackArray sa = new StackArray(10);
		
		sa.push(3);
		sa.push(6);
		sa.push(4);
		sa.push(9);
		sa.push(1);
		
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.peak());
		System.out.println(sa.peak());
	}

}
