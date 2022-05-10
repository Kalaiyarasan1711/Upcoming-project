package com.Maven_Project;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_Adactin {
	
public static WebDriver driver;
	
	public static String value;
	
	
	public static WebDriver get_Driver(String name) {
		
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			
			driver = new FirefoxDriver();	
		}
		return driver;
	}
	
	public static void get_Url(String url) {
		driver.get(url);
	}
	
	public static void send_Keys(WebElement element, String keyvalue) {
		element.sendKeys(keyvalue);
	}
	
	public static void click_on (WebElement element) {
		element.click();
	}
	
	public static void wait_for(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void select_Dropdown(WebElement element, String type,String value) {
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byindex")) {
			int pi = Integer.parseInt(value);
			s.selectByIndex(pi);
		}
		else if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}
		
		else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);
		}
	}
	
	public static void Takes_Screenshot(String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project\\ScreenSnaps\\"+name+".png");
		FileUtils.copyFile(src, des);
	}
	
	public static void action_mouse(WebDriver driver, String type, WebElement element) {
		
		Actions a = new Actions(driver)	;
		
		if (type.equalsIgnoreCase("move")) {
			a.moveToElement(element).perform();
		}
		
		else if (type.equalsIgnoreCase("click")) {
			a.click(element).perform();
		}
		
		else if (type.equalsIgnoreCase("contextclick")) {
			a.contextClick(element).perform();
		}
		
		else if (type.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).perform();
		}
	}
	
	public static void drag_drop(WebDriver d, WebElement y, WebElement z) {
		
		Actions a = new Actions(d);
		a.dragAndDrop(y, z).perform();
	}
	
	public static void keyboard_robot(String type, int code) throws AWTException {
		
		Robot r = new Robot();
		
		if (type.equalsIgnoreCase("press")) {
			r.keyPress(code);
		}
		else if (type.equalsIgnoreCase("release")) {
			r.keyRelease(code);
		}
	}
	
	public static void Scroll_JavaScript(String type, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript(type , element);
		
	}
	
	public static void Sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
	
	public static void clear_value(WebElement element) {
		element.clear();
	}
	
	public static void Alert(String type) {
		Alert a = driver.switchTo().alert();
		
		if (type.equalsIgnoreCase("accept")) {
			a.accept();
		}
		else if (type.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
	}
	
	public static void navigateto(String t) {							
		driver.navigate().to(t);
	}
	
	public static void navigateBack() {										
		driver.navigate().back();
	}
	
	public static void navigateForward() {									
		driver.navigate().forward();
	}
	
	public static void refershtab() {									
		driver.navigate().refresh();
	}
	
	public static String particular_Data_From_Excel(String path, int row_index, int cell_index) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		}
		
		else if (cellType.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
			value = Double.toString(ncv);
		}
		return value;
	}
	
	public static  void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}



}
