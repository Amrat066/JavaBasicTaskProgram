package practical1;

import java.util.Scanner;

public class BreakContinue {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:=");
		int num1=sc.nextInt();
		int i=0;
		while(i<num1) {
			i++;
			if(i==5) {
				continue;
			}
			if(i==9) {
				break;
			}
			System.out.println(i);
			sc.close();
			
		}
		
	}

}
