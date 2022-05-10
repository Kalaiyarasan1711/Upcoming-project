																																																																package com.testing.features;

import org.testng.annotations.Test;

public class Ignore {
	
	
	@Test
	public void Ram() {
		System.out.println("Name is Ram");
	

	}																																																																																																																																																																											  
	@org.testng.annotations.Ignore
	@Test
	public void Ravi() {
		System.out.println("Name is Ravi");
	}
	
	@Test(enabled = false)																																																																																																																			 
	public void EEE() {
         	System.out.println("Dept is EEE");																																																																																																																																																																																																																						

	}
	@Test
	public void CSE() {
		System.out.println("Dept is CSE");

	}																																																																												  
	@Test																																																															 																																																																																																									  																																													 																			 
	
		public void Year() {
		
		System.out.println("Year is 2021");
																																																									
																																																											
	}
	
}
	
	

	
	
	
	
	

