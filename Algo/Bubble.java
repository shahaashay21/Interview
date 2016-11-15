
public class Bubble {

	public static void main(String[] args) {
		int[] sort = {54, 7, 76, 32, 1, 45};
		int[] ans = bubble(sort);
		
		for(int a: ans){
			System.out.println(a);
		}

	}
	
	public static int[] bubble(int[] sort){
		boolean swapped;
		for(int j=0; j<sort.length-1; j++){
			swapped = false;
			for(int i=0; i<sort.length-1; i++){
				if(sort[i] > sort[i+1]){
					int temp = sort[i];
					sort[i] = sort[i+1];
					sort[i+1] = temp;
					swapped = true;
				}
			}
			//If no number is sorted that means array is sorted now and break it.
			if(!swapped){
				break;
			}
		}
		return sort;
	}

}
