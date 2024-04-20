package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListt {

	public static void main(String[] args) {
		
//		LinkedList<String>link=new LinkedList<>();
//		link.add("amrat");
//		link.add("manihs");
//		link.add("satisj");
//		
//		link.add(0,"aniket");
//		link.remove(0);
//		System.out.println(link.contains("amrat"));
//		
//		link.set(0,"raj");
//		
//		System.out.println(link.get(2));
//		for(String i:link) {
//			System.out.println(i);
//		}
		
		//java linkedlist as queue
		
//		Queue<String>s=new LinkedList<>();
//		s.add("a");
//		s.add("b");
//		s.add("c");
//		s.add("d");
//		s.add("e");
//	
//	
//		System.out.println(s.peek());
//		System.out.println(s.poll());
//		System.out.println(s.offer("hii"));
////		System.out.println(s.offer());
//		
//		System.out.println(s);
//	
		//linkedlist as Dqueue
		
	    Deque<String> animals = new LinkedList<>();
	    animals.add("lion");
	    animals.add("tiger");
	    
	    
	    System.out.println(animals);
	    animals.addFirst("hii");
	     System.out.println(animals);
	     
	     animals.poll();
	     System.out.println(animals);
	     animals.addFirst("goat");
	     animals.addLast("camle");
	     animals.offerFirst("elephant");
	     animals.offerLast("monkey");
	     System.out.println(animals.peek());
	     System.out.println(animals);

	     //addlast
	     //getfirst
	     //getlast
	     //removefirst
	     //removelast
	     //poll
	     //offer
	     //peek
	    
	    
	    
	    
		
		
	}

}
