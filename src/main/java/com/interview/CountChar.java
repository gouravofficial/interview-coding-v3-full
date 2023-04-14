package com.interview;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	
	public static void main(String[] args) {
		
		String str="welcomew to india";
		
		char cha[]=str.toCharArray();
		Map<Character, Integer> mapObj=new HashMap<Character, Integer>();
		
		for(char c:cha) {
			Integer i=mapObj.get(c);
			if(i!=null) {
				mapObj.put(c,i+1);
			}else {
				mapObj.put(c,1);
			}
					
			
		}
	mapObj.entrySet().forEach(e->{
		System.out.println(e.getKey()+"-"+e.getValue());
	});
		
	} 
}
