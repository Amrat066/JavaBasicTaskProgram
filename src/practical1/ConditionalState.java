package practical1;
import java.util.Scanner;
public class ConditionalState {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number first:=");
		int a=sc.nextInt();
		
		System.out.println("enter the number second:=");
		int b=sc.nextInt();
		
		System.out.println("enter the number three:=");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+ "number is greater");
		}
		else if(b>a && b>c) {
			System.out.println(b+ "number is greater");
		}
		else {
			System.out.println(c+ "number is greater");
		}
		sc.close();
		
	}


}
