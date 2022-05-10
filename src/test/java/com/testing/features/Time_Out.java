package com.testing.features;

import org.testng.annotations.Test;

public class Time_Out {
	@Test(timeOut = 3000)
	public void login() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("email");
		Thread.sleep(1000);
		System.out.println("password");
		Thread.sleep(2000);
		System.out.println("login");
	

	}
	


}
