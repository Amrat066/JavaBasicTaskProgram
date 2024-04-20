package practical1;

import java.util.Arrays;
import java.util.Scanner;

public class TASK2 {
		public static void main(String args[]) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string1:=");
			String str1=sc.next();
			System.out.println("enter the string1:=");
			String str2=sc.next();
			
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			
			if(str1.length()!=str2.length()) {
				System.out.println("both strings are not anagram");
			}
			else {
			
				
					char[] s1=str1.toCharArray();
					char[] s2=str2.toCharArray();
				
				Arrays.sort(s1);
				Arrays.sort(s2);
				if(Arrays.equals(s1,s2)) {
					System.out.println("the Strings are anagram");
				}
				else {
					System.out.println("the Strings are not anagram");
				}
				sc.close();
//				String s1="";
//				for(int i=0;i<str1.length();i++) {
//					s1+=str1.charAt(i);
//				}
//				String s2="";
//				for(int i=0;i<str2.length();i++) {
//					s2+=str2.charAt(i);
//				}
//				boolean flag=true;
//				for(int i=0;i<s1.length();i++) {
//					
//					if(!s2.contains(""+s1.charAt(i))) {
//						flag=false;
//					}
//				}
//				if(flag) {
//					System.out.println("anagram");
//				}else {
//					System.out.println("not anagram");
//				}
				
			}
		}
}
