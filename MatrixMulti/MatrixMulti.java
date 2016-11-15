import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMulti {
	
	private static Scanner sc;
	private static Scanner sc2;

	public static void main(String s[]){
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		int m,n,p;
		sc2 = new Scanner(System.in);
		
		System.out.println("Enter row and column of first Matrix \n");
		m = sc2.nextInt();
		n = sc2.nextInt();
		
		System.out.println("Enter column of Second Matrix \n");
		p = sc2.nextInt();
		
		System.out.println("Enter your first Matrix \n");
		read(a,m,n);
		
		System.out.println("Enter your second Matrix \n");
		read(b,n,p);
		
		ans = multiply(a,b,m,n,p);
		System.out.println("Answer of Natrix Multiplication \n");
		print(ans,m,n);
		
		
		
	}
	
	public static void read(ArrayList<ArrayList<Integer>> a, int m, int n){
		sc = new Scanner(System.in);
		System.out.println(m+" and "+n);
		for(int i=0; i<m; i++){
			a.add(new ArrayList<Integer>());
			for(int j=0; j<n; j++){
				a.get(i).add(sc.nextInt());
			}
		}
	}
	
	public static void print(ArrayList<ArrayList<Integer>> a, int m, int n){
		for(int i=0; i<m; i++){
			System.out.println("");
			for(int j=0; j<n; j++){
				System.out.print(a.get(i).get(j)+"\t");
			}
		}
	}
	
	public static ArrayList<ArrayList<Integer>> multiply(ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b, int m, int n, int p){
		ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				int temp = 0;
				c.add(new ArrayList<Integer>());
				for(int k=0; k<p; k++){
					temp = temp + a.get(i).get(k) * b.get(k).get(j);
				}
				c.get(i).add(temp);
			}
		}
		return c;
	}
}
