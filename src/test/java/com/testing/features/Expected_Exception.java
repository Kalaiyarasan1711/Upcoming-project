package com.testing.features;


import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions =ArithmeticException.class )
	public void div() {
		
		int a = 10;
		
		int b = 0 ;
		
		System.out.println(a/b);
	

	}

}
