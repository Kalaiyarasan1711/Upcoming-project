package com.testing.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test

public class Soft_Assert {
	
	public void demo() {
	int a=15;
	int b=25;
		
		SoftAssert sc = new SoftAssert();
		
		sc.assertEquals(a, b);
		
		System.out.println("verification");
		
		

	}

}
