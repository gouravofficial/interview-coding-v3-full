package com.interview;


public class DuplicateInt {
	
	public static void main(String[] args) {
		
		
		int arr[]= {20,50,10,20,40,50};
		
		for(int i=0; i<=arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate int==>"+arr[i]);
				}
			}
			
		}
	}

}
