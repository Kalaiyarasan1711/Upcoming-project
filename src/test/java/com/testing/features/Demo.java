package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test(retryAnalyzer = Rerun.class)
	public void demopass() {
		
		String exp ="tamil";
		
	  String act = "english";
	  
	  Assert.assertEquals(act, exp);
	  
	

	}

}
