package com.interview.doubble;

public class SingletonTest {
	
	private static SingletonTest singleObject=null;
	
	private SingletonTest() {
		
	}

	public static SingletonTest getObjSingle() {

		if(singleObject ==null) {
			singleObject =new SingletonTest();
		}
		return singleObject;
	}
}
