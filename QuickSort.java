
public class QuickSort implements SortingAlgorithm {

	public int partition(int [] a, int top, int bot) {
		int i = top;  // Loop down from here.
		int j = bot;  // Loop up from here.
		int pivot = (top + bot) / 2; // One of several pivot selection strategies.
		
		while (i <= j) {
			// Find a large value (greater than pivot) in the start of the (sub-)array
			while (a[i] < a[pivot])
				i++;
			// Find a small value in the end of the (sub-)array
			while (a[j] > a[pivot])
				j--;
			// Swap these values, if appropriate.
			if (i <= j) {
				// ... but first: make sure to keep track of the pivot even if it moves.
				if (i == pivot)
					pivot = j;
				else if (j == pivot)
					pivot = i;
				swap(a, i++, j--);
			}
		}
		// That's all. Return the pivot location (or close enough to it).
		return i;
	}
	void swap (int [] a, int i, int j){
		int temp = a[i]; 
		a[i]=a[j];
		a[j]=temp; 
	}
	
	public void qs(int [] a, int top, int bot) {
		// Call partition to divide the array. Everything above pivot is smaller than everything below.
		int pivot = partition(a, top, bot);
		// Recursively call quick sort on the top and bottom sub-arrays.
		if (top < pivot-1)  // Base case 1: must have at least 1 element to sort
			qs(a, top,pivot -1);
		if (pivot < bot)    // Base case 2: same for the bottom subarray
			qs(a, pivot, bot);
	}
	
	
	
	@Override
	public void sort(int[] a) {
		int top = 0;
		int bot = a.length-1;
		qs(a, top, bot);
		
	}

}
