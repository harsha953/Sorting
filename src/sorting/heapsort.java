package sorting;

public class heapsort {
	private static int n;
	public static void main(String[] args) {
		int array[]={5,8,3,2,7,1,8,9,1,5,4};
		
		heap(array);
		for ( int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	private static void swap(int array[], int index1, int index2) 
	
	{
		int temp = array[index1];           
		array[index1] = array[index2];      
		array[index2] = temp;           
	}
	
	private static void heap(int[] array) {
		heapify(array);
		for (int i = n; i > 0; i--) {
			swap(array, 0, i);
			n=n-1;
			maxheap(array,0);
			
		}
		
		
	}
	private static void maxheap(int[] array, int i) {
		 	int left = 2*i ;
	        int right = 2*i + 1;
	        int max = i;
	        if (left <= n && array[left] > array[i])
	            max = left;
	        if (right <=n && array[right] > array[max])        
	            max = right;
	 
	        if (max != i)
	        {
	            swap(array, i, max);
	            maxheap(array, max);
	        }
		
	}
	private static void heapify(int[] array) {
		n=array.length-1;
		for (int i = n/2; i >=0; i--) {
			maxheap(array, i);
		}
		
	}

}
