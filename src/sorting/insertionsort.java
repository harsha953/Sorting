package sorting;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={5,8,3,2,7,1,8,9,1,5,4};
		int j;
		for (int i = 1; i < array.length; i++) {
			int hold=array[i];
			for (j = i-1; j >=0 && hold<array[j]; j--) {
				array[j+1]=array[j];
			}
			array[j+1]=hold;
		}
		for ( int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
