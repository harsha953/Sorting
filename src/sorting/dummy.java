package sorting;

import java.util.Vector;

public class dummy {

	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(25);
		v1.add(10);
		System.out.println(v1);
		foo(v1);
		System.out.println(v1);

	}

	private static void foo(Vector<Integer> v2) {
		
		v2.add(35);
		
	}

}
