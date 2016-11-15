
public class Shell {

	public static void main(String[] args) {
		int[] sort = {54, 32, 7, 76, 32, 1, 45};
		int[] ans = shell(sort);
		
		for(int a: ans){
			System.out.print(a);
			System.out.print(" ");
		}

	}
	
	public static int[] shell(int[] sort){
		int length = sort.length;
		while(length >= 1){
			int gap = length/2;
			int i = 0;
			while(i+gap < sort.length){
				if(sort[i] > sort[i+gap]){
					swap(sort, i, i+gap);
					int j = i;
					while(j >= gap){
						if(sort[j-gap] > sort[j]){
							swap(sort, j-gap, j);
						}
						j--;
					}
				}
				i++;
			}
			
			if(length == 1){
				break;
			}
			length /= 2;
		}
		return sort;
	}
	
	

	public static void swap(int[] sort, int a, int b){
		int temp = sort[a];
		sort[a] = sort[b];
		sort[b] = temp;
	}

}
