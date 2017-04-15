package sorting;

public class bubblesort {

	public static void main(String[] args) {
		int  array[]={5,8,3,2,7,1,8,9,1,5,4};
		boolean swapped=true;
		int i=0;
	while(swapped){
			swapped=false;
			i++;
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]>array[j+1]){
					int temp;
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					swapped=true;
				}
			}
		
	}
		for ( i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
