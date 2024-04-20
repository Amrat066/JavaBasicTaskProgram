package practical1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	static int Largest(int[]a,int n) {
		Arrays.sort(a);
		return a[n-2];
		
	}
	static int greater(Integer[] b, int n) {
		List<Integer>list=Arrays.asList(b);
		Collections.sort(list);
		int element=list.get(n-2);
		return element;
		
	}

	public static void main(String[] args) {
		int []a= {11,23,90,77,34};
		System.out.println("the second largest number:="+Largest(a,5));
		Integer []b= {11,23,90,77,34};
		System.out.println("the second largest number is:="+greater(b,5));

		
	}

}
