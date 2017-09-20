
public class MergeSort implements SortingAlgorithm {

	private void printarr(int[] arr){
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i]);
			System.out.print(" ");
			
		}
		System.out.println();
	}
	
	private void merge(int[] a, int[] top, int[] bot) {
		int top_index = 0; 
		int bot_index = 0; 
		int a_index=0;
		
		while(top_index<top.length && bot_index<bot.length){
			if(top[top_index]<=bot[bot_index]){
				a[a_index++]= top[top_index++];
			}
			else{
				a[a_index++]=bot[bot_index++];
			}
 
		}
		
		System.arraycopy(bot, bot_index, a, a_index, bot.length - bot_index);
		System.arraycopy(top, top_index, a, a_index, top.length - top_index);

	}
	
	@Override
	public void sort(int[] a) {

		int start = 0; 
		int end = a.length-1;
		int mid = (start+a.length)/2;
		int []top = new int [mid]; 
		int []bot = new int [a.length-mid]; 
	
		
		if(a.length>1){
		System.arraycopy(a, 0,top,0,mid);
		System.arraycopy(a, mid, bot,0, a.length-mid);
		sort(top); 
		sort(bot);
		merge(a, top, bot);
	}
		
	}

}
