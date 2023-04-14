package com.interview;


public class DuplicateIntArr {
	
	public static void main(String[] args) {
		
		
		int dupArr[]= {1,2,1,2,3,4,5,4,52,234,2353,3232,243,33,5,2,5,};
		
		for(int i=0; i<dupArr.length; i++) {
			
			for(int j=i+1; j<dupArr.length; j++) {
				
				if(dupArr[j]==dupArr[i]) {
					System.out.println("Duplicate Value====>"+dupArr[j]);
				}
				
			}
		}
	}

}
