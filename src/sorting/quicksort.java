package sorting;

public class quicksort {

	public static void main(String[] args) {
		int array[]={5,8,3,2,7,1,8,9,1,5,4 };
		int low=0;
		int high=array.length-1;
		qs(array,low,high);
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
	private static void qs(int[] array, int low, int high) {
		int i=low;
		int j=high;
		int pivot=array[(low+high)/2];
		while (i<=j) {
			
			while (array[i]<pivot) {
				i++;
			}
			while (array[j]>pivot) {
				j--;
			}
			if(i<=j){
				swap(array, i,j);
				i++;
				j--;
			}
			
		}
		if (low<j) {
			qs(array, low, j);
		}
		if (i<high) {
			qs(array, i, high);
		}

	}
	

}
