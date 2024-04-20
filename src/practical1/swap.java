package practical1;

import java.util.Scanner;

class swapp{
	
		static void test(String str1,String str2) {
			String a,b;
			a=str1+ " "+str2;
			b=a.split(" ")[0];
			a=a.split(" ")[1];
			System.out.println(a+" "+b);
		}
}
public class swap {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string1:=");
			String str1=sc.next();
			System.out.println("enter the string2:=");
			String str2=sc.next();
			swapp.test(str1, str2);
			sc.close();
			
		}
}
