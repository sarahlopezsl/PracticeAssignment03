
public class BubbleSort implements SortingAlgorithm {
	
	void swap (int [] a, int i, int j){
		int temp = a[i]; 
		a[i]=a[j];
		a[j]=temp; 
	}

	@Override
	public void sort(int[] arr) {
		boolean swapped = true;
		for(int j = 0; j <arr.length&& swapped; j++){
			swapped = false; 
			for(int i = 0; i<arr.length-j-1; i++){
				if(arr[i]>(arr[i+1])){
					swap(arr,i,i+1);
					swapped = true;
				}
			}
		}
	}

}
