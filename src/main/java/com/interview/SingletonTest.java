package com.interview;


public class SingletonTest {
	
	private static SingletonTest single_object=null;
	
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		
		if(single_object ==null) {
			single_object= new SingletonTest();
		}
		return single_object;
	}

}
