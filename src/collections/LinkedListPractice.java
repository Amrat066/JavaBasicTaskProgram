package collections;

import java.util.LinkedList;
import java.util.Scanner;

class test{
	
	static void addelement(LinkedList<Integer> element) {
	}
	
}
public class LinkedListPractice {

	public static void main(String[] args) {
		
		LinkedList<Integer> st=new LinkedList<Integer>();
		test t=new test();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("press 1:for adding the element:=");
			System.out.println("press 2:for read the list:=");
			System.out.println("press 3:for update the list:=");
			System.out.println("press 4:for delete the content of the list:=");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
					t.addelement(st);
				break;
				
			}
			
			
		}while(choice!=4);
		
		
		
		
		
		
		

	}

}
