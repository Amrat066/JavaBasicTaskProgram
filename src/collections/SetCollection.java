package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetCollection {
	
	
	public static void main(String args[]) {
		
		//hashset
		HashSet<String> st=new HashSet<>();
		st.add("abc");
		st.add("jj");
		st.add("rrr");
		st.add("abc");
		System.out.println("the first set is:="+st);
		
		HashSet<String>s=new HashSet<>();
		s.addAll(st);//addall
		System.out.println("the second set is:="+s);
		
		System.out.println(s.contains("abc")); //contains
		System.out.println(s.equals(st));//equal method
		System.out.println();//same method as arraylist
		
		//LinkedHashsets
		LinkedHashSet<String>str=new LinkedHashSet<>();
		str.add("amrat");
		str.add("satish");
		str.add("mukesh");
		str.add("sanjay");
		
		System.out.println(str);
		System.out.println("same method as the hashsets");
		
	}

}
