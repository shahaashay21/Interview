
public class Merge {

	
	public static void main(String[] args) {
		int[] sort = {54, 32, 7, 76, 32, 1, 45};
		merge(sort);
		for(int a: sort){
			System.out.print(a);
			System.out.print(" ");
		}
		System.out.println();
		Integer ans = binarySearch(sort, 7);
		if(ans != null){
			System.out.println("Got answer "+ans);
		}else{
			System.out.println("Your data is not in array");
		}
	}
	
	public static int[] merge(int[] sort){
		domerge(sort, 0, sort.length-1);
		return sort;
	}
	
	public static void domerge(int[] sort, int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			
			int middle = (lowerIndex + higherIndex) / 2;
			domerge(sort, lowerIndex, middle);
			domerge(sort, middle+1, higherIndex);
			combine(sort, lowerIndex, middle, higherIndex);
		}
	}
	
	public static void combine(int[] a, int lowerIndex, int middle, int higherIndex){
		int[] temp = new int[higherIndex - lowerIndex + 1];
		int i = lowerIndex;
		int j = middle+1;
		int k = 0;
		
		while(i <= middle && j <= higherIndex){
			if(a[i] <= a[j]){
				temp[k++] = a[i++];
			}else{
				temp[k++] = a[j++];
			}
		}
		
		while(i <= middle){
			temp[k++] = a[i++];
		}
		while(j <= higherIndex){
			temp[k++] = a[j++];
		}
		for(int x =temp.length-1; x>= 0; x--, higherIndex--){
			a[higherIndex] = temp[x];
		}
	}
	
	public static Integer binarySearch(int[] sort, int data){
		int low = 0;
		int high = sort.length-1;
		
		while(low < high){
			int m = (low+high)/2;
			if(sort[m] == data){
				return data;
			}else if(sort[m] > data){
				high = m-1;
			}else{
				low = m+1;
			}
		}
		return null;
	}
}