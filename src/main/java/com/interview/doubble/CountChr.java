package com.interview.doubble;

import java.util.HashMap;
import java.util.Map;

public class CountChr {
	
	public static void main(String[] args) {
		
		
		String str="Helloindia";
		
		char ch[]=str.toCharArray();
		
		
		Map<Character, Integer> mapObj=new HashMap<Character, Integer>();
		
		for(char c:ch) {
			
			Integer i=mapObj.get(c);
			if(i !=null) {
				
				mapObj.put(c, i+1);
			}else {
				mapObj.put(c, 1);
			}
			
		}
		
		
		mapObj.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		});
		
		
		
	}

}
