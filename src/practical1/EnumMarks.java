package practical1;

import java.util.Scanner;

enum Grade{
	AA,BB,CC,DD
	
}
public class EnumMarks {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks for each subject");
		int []marks =new int[3];
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter the marks:=");
			marks[i]=sc.nextInt();
		}
//		double totalMarks= marks[0]+marks[1]+marks[2];
//		double avg=(totalMarks)/3;
//		System.out.println("the average is :="+avg);
//		if(avg>=80 && avg<=100) {
//			
//			System.out.println("the grade is:="+Grade.AA);
//		}
//		else if(avg>=60 && avg<=70) {
//			System.out.println("the grade is:="+Grade.BB);
//		}
//		else if(avg>=50 && avg<=60) {
//			System.out.println("the grade is:="+Grade.CC);
//		}
//		else {
//			System.out.println("you r failed with the grade:="+Grade.DD);
//		}
		
	
	}

}
