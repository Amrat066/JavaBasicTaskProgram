package practical1;

import java.util.Scanner;

class test{
	
	
	String Charatexample(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='t') {
				count++;
			}
			
		}
		return String.valueOf(count);
		
	}
}
 
public class StringMethods {
	
	public static void main(String args[]) {
		test t=new test();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:=");
		String st=sc.next();
		String result=t.Charatexample(st);
		System.out.println(result);
		sc.close();

		
	}

}
