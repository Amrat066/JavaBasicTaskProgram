package practical1;

import java.util.Scanner;

class PCheck{
	
	
	public static String PasswordCheck(String pass) {
		boolean upchars=false,lchars=false,
		digit=false,spc=false;
		int total=pass.length();
		String[] Commonword= {"pass123","abc22","1234","amu@123"};
		boolean flag=false;
		for(String word:Commonword) {
			if(word.toLowerCase().contains(pass.toLowerCase())) {
					flag=true;
			}
		}
		if(flag) {
			System.out.println("password is unsufficient plz try another password...");
		}
		
		for(int i=0;i<total;i++) {
				char ch =pass.charAt(i);
				if(Character.isUpperCase(ch)) {
					upchars=true;
				}
				else if(Character.isLowerCase(ch)) {
					lchars=true;
				}
				else if(Character.isDigit(ch)){
					digit=true;
				}
				else {
					
					spc=true;
				}
		}
			
		if(upchars && lchars && digit && spc==true && (total==12)) {
				System.out.println("your password is strong");
			}
		
			else if(total>=8 && total<=11 ) {
				System.out.println("your password is moderate!try again");
			}
			else if(total>=1 && total<=7) {
				System.out.println("your password is weak!try again");
			}
			else {
				System.out.println("password must be contain 12 character");
			}
			return pass;
		}
	
}
public class TASK3 {	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password:=");
		String password=sc.next();
		PCheck.PasswordCheck(password);
		sc.close();
		
	}

}
