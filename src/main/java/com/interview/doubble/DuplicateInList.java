package com.interview.doubble;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInList {
	
	public static void main(String[] args) {
		
		
		List<Integer> orignalList=Arrays.asList(1,2,3,4,2,3,5,6,7);
		
		
		List<Integer> duplicateValue=orignalList.stream().distinct().filter(entry -> Collections.frequency(orignalList, entry) >1).collect(Collectors.toList());
		
		System.out.println("Duplicate==>"+duplicateValue);
		
		List<Integer> uniqueValue=orignalList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Unique Value==>"+uniqueValue);
	}		

}
