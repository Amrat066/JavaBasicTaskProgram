package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionn {
	
	
	public static void main(String args[]) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(0, "amrat");
		map.put(1, "sanjay");
		map.put(2, "hitesh");
		
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println("the key is:="+m.getKey()+" "+ "the value is:="+m.getValue());
			
		}
		System.out.println(map.containsKey(2));
		System.out.println(map.isEmpty());
		System.out.println(map.get(2));
		map.clear();
		System.out.println(map);
		
		HashMap<Integer,String>map2=new HashMap<>();
		map2.put(0, "amrat");
		map2.put(1, "satyam");
		map2.put(3, "hitesh");
		
		map.putAll(map2);
		System.out.println(map);
		
		System.out.println(map2);
		
		System.out.println(map.equals(map2));
		
		System.err.println(map.remove(1));
		

		System.out.println("all methods are same");

	}

}
