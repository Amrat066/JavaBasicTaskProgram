package collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Queuee {

		public static void main(String args[]) {
			Queue<Integer> q=new PriorityQueue<>();
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);
			q.add(5);
	
			System.out.println("first queue"+ q);
			Iterator<Integer> j=q.iterator();
			while(j.hasNext()) {
				System.out.println(j.next());
			}

			Queue<Integer> i=new PriorityQueue<>();
			i.addAll(q);
			System.out.println("second queue"+ i);
			
			Queue<String> l=new PriorityQueue<String>();
			
			
			Queue<String> u=new LinkedList<>();
			
			
			Deque<String> d=new LinkedList<>();
			
			
			
			
		}
}
