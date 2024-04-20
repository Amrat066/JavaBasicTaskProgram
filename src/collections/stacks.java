package collections;

import java.util.Stack;



public class stacks {
	
	 static void stackpush(Stack<Integer>stack) {
		 
		 for(int i=0;i<10;i++) {
			 stack.push(i);
			 
		 }
		 
	 }
	 static void stackpop(Stack<Integer>stack) {
		 
		
		 int element=stack.pop();
		 System.out.println("the poped element is:="+element);
		 
	 }
	 static void stackpeep(Stack<Integer>stack) {
		 
		 int peep=stack.peek();
		 System.out.println("the peeped element is:"+peep);
	 }
	
	 static void display(Stack<Integer> stack) {
		 
		 System.out.println("the element is:=");
		 for(int i=0;i<10;i++) {
			 System.out.println(i);
		 }
	 }
	public static void main(String args[]) {
		
		Stack<Integer> stack=new Stack<Integer>();
		stackpush(stack);	
		stackpop(stack);
		stackpeep(stack);
		display(stack);

		
	}

}
