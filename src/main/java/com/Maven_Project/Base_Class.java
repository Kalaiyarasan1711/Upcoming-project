package com.Maven_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	
	public static WebDriver driver;
	
	//browserLaunch
	public static WebDriver browserlaunch(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
			
			
		}
		
		return driver;
		
		}





//get
public static void urlLaunch(String url) {
	driver.get(url);
	
}


//close

public static void closebrowser() {
	driver.close();
	
}
//Quit
public static void quitbrowser() {
	driver.quit();
	
}

//sendkeys

public static void  passinput(WebElement element, String input) {
	element.sendKeys(input);
	}
//click
public static void clickonElement(WebElement element){
	element.click();
	
}

//navigate to
public static void navigateto(String url) {
	driver.navigate().to(url);
	
}

//navigate back







//navigate forward




//navigate refresh





//get





//alert
public static void alert( String type)	{
	Alert alert = driver.switchTo().alert();
	if(type.equalsIgnoreCase("accept")){
		alert.accept();
		
	}
	else if(type.equalsIgnoreCase("d")) {
		alert.dismiss();
	}

}





//Actions








//Frames





//robot





//windows handles





//Drop down





//check box





//is enable





//is displayed





//is selected






//Get options





//Get title





//Get text





//Get current url





//Get attributes





//wait





//Take screenshot





//Scroll up and down





//Get first selected options






//Get all selected options





//Is multiple





//Radio button






























}



	

				
