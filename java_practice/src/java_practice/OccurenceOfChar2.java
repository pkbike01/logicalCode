package java_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfChar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str = sc.next();
		System.out.println(str);
		
		
		
		
//		String str = "pankaaaaajp";
		charCount(str);
		
	}
	
	public static void charCount(String inputString) {
		Map<Character,Integer> charCountMap = new HashMap<>();
		
		char[] strArr = inputString.toCharArray();
		for(char c : strArr) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c,charCountMap.get(c) + 1);
				
			}
			else {
				//
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);//it doesn't maintain insertion
//		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//			System.out.println(entry.getKey()+ " : "+ entry.getValue());
//		}
	}
	
	

}
