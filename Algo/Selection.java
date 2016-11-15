
public class Selection {

	public static void main(String[] args) {
		int[] sort = {54, 7, 76, 32, 1, 45};
		int[] ans = selection(sort);
		
		for(int a: ans){
			System.out.println(a);
		}

	}
	
	public static int[] selection(int[] sort){
		for(int i=0; i<sort.length; i++){
			int min = sort[i];
			int pos = i;
			for(int j=i+1; j<sort.length; j++){
				if(min > sort[j]){
					min = sort[j];
					pos = j;
				}
			}
			if(i != pos){
				int temp = sort[i];
				sort[i] = sort[pos];
				sort[pos] = temp;
			}
		}
		return sort;
	}

}
