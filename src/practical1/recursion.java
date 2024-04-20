package practical1;

import java.util.Scanner;




public class recursion {
	
//	 	static int fibo(int n) {
//		if(n==1 || n==0) {
//			return 1;
//		}
//		else {
//			return fibo(n- 1) + fibo(n - 2);
//		}
//	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println("Enter the number:=");
		int n=sc.nextInt();
		System.out.println(a+"\n"+b);
		for(int i=3;i<n;i++) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println("fibonacci series:="+c);
		//int result=fibo(n);
		//System.out.println(result);
		sc.close();
		
	}

}
