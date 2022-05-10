package com.testing.features;

import org.testng.annotations.Test;

public class Dependency {
	@Test(enabled = false)
	public void compiler() {
		
		System.out.println("compiler");
	

	}
	@Test(dependsOnMethods = "compiler")
	public void java() {
		System.out.println("java");

}
}