package practical1;

import java.util.Scanner;

public class PallindromString {
//	public static boolean IsPallindrom(String str) {
//		
//		String rev="";
//		boolean ans=false;
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//			
//		}
//		if(str.equals(rev)) {
//			 ans=true;
//		}
//		return ans;
//		
	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the String:=");
//		String str=sc.nextLine();
//		str = str.toLowerCase();
//		boolean A=IsPallindrom(str);
//		System.out.println(A);
		String original, reverse = ""; 
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();  
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   
		
	}

}
