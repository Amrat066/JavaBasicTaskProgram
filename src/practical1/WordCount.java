package practical1;

import java.util.Scanner;

class Word{
	
	public static String word(String s) {
		
			int count=0;
	      String[] arrayStr = s.split(" ");
	      for(int i=0;i<arrayStr.length;i++) {
	    	  count++;
	      }
	      
	      return String.valueOf(count);
			
	}
}
public class WordCount {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:=");
		String s=sc.nextLine();
		String str=Word.word(s);
		System.out.println(str);
		sc.close();
		
		
	}

}


