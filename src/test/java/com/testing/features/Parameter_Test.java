package com.testing.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {
	@Test
	@Parameters({"emailid","pass"})
	public void login(String pass, String emailid) {
		
		System.out.println("email id is " + "  " + emailid);
		System.out.println("pass is" + "  " + pass);
		

	}

}
