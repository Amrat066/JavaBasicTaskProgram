package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractical {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> st=new ArrayList<String>();
		int choice;
		do {
			System.out.println("press1 :Add string\n");
			System.out.println("press2 :display string\n");
			System.out.println("press3: searching the string");
			System.out.println("press4 :remove string\n");
			System.out.println("press5 :exit\n");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1: 
				System.out.println("Enter the String:=");
				String s=sc.next();
				st.add(s);
				System.out.println("the string is:="+st);
				break;
			
			case 2:
					if(st.isEmpty()) {
						System.out.println("the list is empty");
					}else {
						System.out.println("the strings are:=");
						for(String str:st) {
							System.out.println(str);
						}
					}
				break;
			case 3:
					if(st.isEmpty()) {
						System.out.println("the list is empty");
					}
					else {
						System.out.println("enter the string which you want to search");
						String srch=sc.next();
						if(st.contains(srch)) {
							System.out.println("the string is found successfully");
						}
						else {
							System.out.println("the string is not found");
						}
					}
				break;
			case 4:
					if(st.isEmpty()) {
						System.out.println("the list is empty");
					}
					else {
						System.out.println("enter the string which you want to remove");
						String rmv=sc.next();
						if(st.contains(rmv)) {
							st.remove(rmv);
							System.out.println("the string is remove successfully");
						}
						else {
							System.out.println("the string is not found");
						}
					}
				 break;
			case 5:
					System.out.println("bye bye......");
				break;
				
			default:
				System.out.println("invalid choice...plz re enter your choice");
				sc.close();

			}
			
		}while(choice!=5);
	}

}
