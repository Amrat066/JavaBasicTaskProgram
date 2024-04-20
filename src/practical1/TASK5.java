package practical1;

import java.util.Scanner;

enum Answer{
	YES,NO,MAYBE,NEVER
		         
}
public class TASK5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ask the question:=");
		String sQuestion=sc.nextLine();	
		Answer aAnswer=GiveAnswer();
		System.out.println(sQuestion);
		System.out.println(aAnswer);
		sc.close();
	}
	static Answer GiveAnswer() {
	Answer[] aAns=Answer.values();
	int data=(int) (Math.random()*aAns.length);
	return aAns[data];
	
	
		
		
		
	}

}
