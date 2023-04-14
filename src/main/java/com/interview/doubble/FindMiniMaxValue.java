package com.interview.doubble;

public class FindMiniMaxValue {
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,4,5,6,2,19};
		
		int min=0;
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(min ==0 && max ==0) {
				min=arr[i] ;
				max=arr[i] ;
			}
			
			if(arr[i] >max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println("max==>"+max);
		System.out.println("min==>"+min);
	}

}
