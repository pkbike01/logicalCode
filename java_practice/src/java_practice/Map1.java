package java_practice;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	
	
	
	public static void main(String[] args) {
		Map<Character,Integer> m = new HashMap<>();
		m.put('a', 2);
		m.put('b', 2);
		System.out.println(m);
//		Map.Entry<Character, Integer>
		Integer integer = m.get('a')+1;
		System.out.println(integer);
		
		
		
		
	}

}
