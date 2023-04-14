package com.interview.doubble;

public class DuplicateValueIntArrr {
	
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,2,3,4,46,1,34,444,7,3};
		
		for(int i=0; i<=arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[j]);
				}
			}
		}
		
		
	}

}
