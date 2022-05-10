package com.testing.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {

	@BeforeSuite
	public void PropertySetting() {
		
		System.out.println("propertSetting");
		

	}
	@BeforeTest
	public void browserlaunch() {
		System.out.println("browserlaunch");
		
		
		}
	@BeforeClass
	public void urlLaunch() {
		
		System.out.println("urlLaunch");
	

	}
	@BeforeMethod
	public void signin() {
		System.out.println("signin");

	}
	@Test(priority=0)
	public void moblie() {
		System.out.println("mobiles");

	}
	@Test(priority=3)
	public void homeappliances() {
		System.out.println("homeappliances");
		

	}
	@Test(priority=2)
	public void books() {
		System.out.println("books");

	}
	@AfterMethod
	public void signout() {
		System.out.println("signout");
		
		

	}
	@AfterClass
	public void homepage() {
		System.out.println("homepage");

	}
	@AfterTest
	private void deletecookies() {
	System.out.println("deletecookies");

	}
	@AfterSuite
	private void quitbrowser() {
	System.out.println("quitbrowser");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}
