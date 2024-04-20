package practical1;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:=");
		int num=sc.nextInt();
		int originalnum,digit,rev=0;
		originalnum=num;
		while(num!=0) {
			digit=num%10;
			rev=rev+digit*digit*digit;
			num=num/10;
		}
		if(rev==originalnum) {
			System.out.println("the number is armstrong");
		}else {
			System.out.println("the number is not armstrong");
		}
	}

}
