package java_practice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar1 {
	public static void characterCount(String inputString) {
		//First, I am creating a hashMap containing character as key and Occurrence as value. 
		HashMap<Character,Integer> charCountMap = new HashMap<>();
		
		//Then, converting given String to char Array.
		
		char[] strArray = inputString.toCharArray();
		
		//Now, checking each char of strArray
		for(char c : strArray) {
			if(charCountMap.containsKey(c)) {
				//if char is present in charCountMap then incrementing its count by 1.
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else {
				//if char is not present in charCountMap;
				charCountMap.put(c, 1);
			}
		}
		
		//printing the charCountMap
		
		
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}		
	}
	public static void main(String[] args) {
		String str = "paannkaj";
		characterCount(str);
	}
	
	

}
