package practical1;

import java.util.Scanner;

public class factorial {
	
	   static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n* fact(n-1);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:=");
		int f=sc.nextInt();
		int result=fact(f);
		System.out.println("the factorial number is:="+result);
		sc.close();
	}
	

}
