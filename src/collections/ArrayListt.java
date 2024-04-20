package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListt {
	
	public static void main(String args[]) {
		ArrayList<Integer>i=new ArrayList<>();
		i.add(4);
		i.add(3);
		i.add(8);
		i.add(6);
		i.add(2);
		
		i.remove(4);//remove the data
		i.remove(1);//remove the data
		
		i.add(0,9);//add the data on the particular index value
		
		System.out.println(i.add(44)); //add the data at the end of the array lists
		
		System.out.println(i.get(4));//get the specific value from the data

		System.out.println(i.contains(5));// return the true and false values
		
		Iterator<Integer> j=i.iterator();//iterator method to iterate the values
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
		System.out.println("the size of the arraylist is:="+i.size());//size method	
		
		Integer[] array=new Integer[i.size()];//convert the arraylist in the array
		array=i.toArray(array);
		
		int sum=0;
		for(int m:array) {
			sum+=m;
			
		}
		System.out.println("the sum of the number is:="+sum);
		
		if(i.isEmpty()) { //check the list is empty or not
			System.out.println("the list is empty");
		}else {
			System.out.println("the list is not empty");
			
		}
		System.out.println(i.indexOf(8));
		
		Collections.sort(i);//sort the list
		System.out.println(i);

		
		
		
		
	
		
		
	}

}
