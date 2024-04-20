package practical1;

import java.util.Scanner;

class MaxMin{
	
	static void data(String str) {
		char [] ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
					if(ch[i]==ch[j]) {
						System.out.println(ch[j]);
					}
			}
		}
			
	}
}
public class DublicateCharacter {
	
	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string:=");
		String str=sc.nextLine();
		MaxMin.data(str);
		sc.close();
		
		
	}

	

}
