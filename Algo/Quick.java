
public class Quick {

	public static void main(String[] args) {
		int[] sort = {54, 32, 7, 76, 32, 1, 45};
		int[] ans = quick(sort);
		
		for(int a: ans){
			System.out.print(a);
			System.out.print(" ");
		}

	}
	
	public static int[] quick(int[] sort){
		doQuick(sort, 0, sort.length-1);
		return sort;
	}
	
	public static void doQuick(int[] sort, int min, int max){
		if(min < max){
			int m = partition(sort, min, max);
			doQuick(sort, min, m-1);
			doQuick(sort, m+1, max);
		}
	}
	
	public static int partition(int[] sort, int min, int max){
		int pivot = sort[min];
		int i = min; int j = max;
		
		while(i<j){
			while(sort[i] <= pivot && i < sort.length){
				i++;
			}
			while(sort[j] > pivot && j >= 0){
				j--;
			}
			if(i < j){
				swap(sort, i, j);
			}
		}
		swap(sort, min, j);
		return j;
	}
	
	public static void swap(int[] sort, int a, int b){
		int temp = sort[a];
		sort[a] = sort[b];
		sort[b]= temp;
	}

}
