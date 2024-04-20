package practical1;
import java.util.*;

public class Arithmeticc {
	
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Addition\n");
			System.out.println("Substraction\n");
			System.out.println("multiplication\n");
			System.out.println("division\n");
			System.out.println("Exit\n");
			System.out.println("enter your choice.........:=");
			choice =scanner.nextInt();
			switch(choice) {
				
			case 1:
				add(scanner);
				break;
				
			case 2:
				sub(scanner);
				break;
			case 3:
				mul(scanner);
				break;
			case 4:
				divide(scanner);
				break;
			case 5:
				System.out.println("bye bye.........");
				break;
			default:
				System.out.println("invalid choice please enter your choice again...........");
				
			}
		}while(choice!=5);
	}
	static void add(Scanner scanner) {
		System.out.println("enter the number1:=");
		int num1=scanner.nextInt();
		System.out.println("enter the number2:=");
		int num2=scanner.nextInt();
		int result=num1+num2;
		System.out.println("the sum of the numbers are:=" +result);
		System.out.println("............//.............//..................//................//");
	}
	static void mul(Scanner scanner) {
		System.out.println("enter the number1:=");
		int num1=scanner.nextInt();
		System.out.println("enter the number2:=");
		int num2=scanner.nextInt();
		int result=num1*num2;
		System.out.println("the multiplication of the numbers are:="+result);
		System.out.println("............//.............//..................//................//");

	}
	static void sub(Scanner scanner) {
		System.out.println("enter the number1:=");
		int num1=scanner.nextInt();
		System.out.println("enter the number2:=");
		int num2=scanner.nextInt();
		int result=num1-num2;
		System.out.println("the substraction of the numbers are:="+result);
		System.out.println("............//.............//..................//................//");

	}
	static void divide(Scanner scanner) {
		System.out.println("enter the number1:=");
		int num1=scanner.nextInt();
		System.out.println("enter the number2:=");
		int num2=scanner.nextInt();
		int result=num1/num2;
		System.out.println("the division of the numbers are:="+result);
		System.out.println("............//.............//..................//................//");

	}

}
