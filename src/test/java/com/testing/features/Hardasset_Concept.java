package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardasset_Concept {
	@Test
	public void compare() {
		
		String name1 = "RAJA";
		String name2 = "raja";
		Assert.assertNotEquals(name1, name2);
		System.out.println("validation");
		

		
	
		

	}

}
