package practical1;

import java.util.Scanner;

class Countt{
	
	public static String test(String str) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count=count+1;
			}
			
		}
		return String.valueOf(count);
		
	}
}
public class CharacterCount {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:=");
		String str=sc.nextLine();
		String result=Countt.test(str);
		System.out.println("the total character is:="+result);
		sc.close();
		
	}
}












