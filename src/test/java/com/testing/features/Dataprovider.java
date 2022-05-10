package com.testing.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider = "inputdata")
	public void data(String username, String pass) {
		System.out.println("user name is:" + username);
		System.out.println("password is:"+pass);
	

	}
	@DataProvider
	public Object[][] inputdata() {
		return  new Object[][] {
			
			{"arun","145"},{"ajay","456"}
			
		};
	}

}
