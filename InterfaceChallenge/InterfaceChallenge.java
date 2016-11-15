import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<String> readValues(){
		ArrayList<String> values = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n"
				+"1 to enter a string\n"
				+"0 to Exit");
		
		while(quit){
			System.out.println("Choose an option");
			int choice = scan.nextInt();
			
			switch(choice){
				case 0:
					quit = true;
					break;
				case 1:
					System.out.println("Enter a String: ");
					values.add(index, scan.nextLine());
					index++;
			}
		}
		return values;
		
	}

}
