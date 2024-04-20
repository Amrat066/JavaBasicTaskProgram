package practical1;

import java.util.Scanner;

public class Prime {
	
	static boolean Isprime(int n) {
		
		
		if(n==0 || n==1) {
			return false;
		}
		if(n==2)
			return true;
		
			for(int i=2;i<=n;i++) {
			if(n%i==0)
				return false;
			return true;
			}
		
		return false;
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:=");
		int n=sc.nextInt();
		boolean A =Isprime(n);
		System.out.println(A);
		
	}

}
