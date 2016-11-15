
public class Insertion {

	public static void main(String[] args) {
		int[] sort = {54, 32, 7, 76, 32, 1, 45};
		int[] ans = insertion(sort);
		
		for(int a: ans){
			System.out.print(a);
			System.out.print(" ");
		}

	}
	
	public static int[] insertion(int[] sort){
		for(int i=1; i<sort.length; i++){
			int j = i;
			while(j>0 && sort[j-1] > sort[j]){
				int temp = sort[j];
				sort[j] = sort[j-1];
				sort[j-1] = temp;
				j--;
			}
		}
		return sort;
	}

}
