package sorting;

public class selectionsort {

	public static void main(String[] args) {
		int array[]={5,8,3,2,7,1,8,9,1,5,4};
		int j;
		for (int i = 0; i < array.length-1; i++) {
			int min=array[i];
			for (j = i+1; j < array.length; j++) {
				if (array[j]<array[min]) {
					min=j;
				}
			}
		
			if(min!=i){
				int temp;
				temp=array[i];
				array[i]=array[min];
				array[min]=temp;
			}
		}
		for ( int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
