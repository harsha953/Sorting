package sorting;

public class mergesort {

	public static void main(String[] args) {
		int array[]={5,8,3,2,7,1,8,9,1,5,4};
		
		ms(array, 0, array.length-1);
		for ( int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static void ms(int[] array, int l, int h) {
		if (l<h) {
			int middle=(l+h)/2;
			ms(array, l, middle);
			ms(array, middle+1, h);
			merge(array, l,middle,h);
		}
		
	}

	private static void merge(int[] array, int l, int middle, int h) {
		int i=l;
		int j=middle+1;
		int k=l;
		int[] temparray=new int[array.length];
		for (int k2 = 0; k2 < array.length; k2++) {
			temparray[k2]=array[k2];
			
		}
		while (i<=middle && j<=h) {
			if (temparray[i]<temparray[j]) {
				array[k]=temparray[i];
				i++;
			}else{
				array[k]=temparray[j];
				j++;
			}
			k++;
		}
		while (i<=middle) {
			array[k]=temparray[i];
			i++;k++;
		}
		while (j<=h) {
			array[k]=temparray[j];
			j++;k++;
		}
		
	}

}
