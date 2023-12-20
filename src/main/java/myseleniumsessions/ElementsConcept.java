package myseleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// driver.findElement(By.id("input-email")).sendKeys("ramya@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("1234");

		// 2nd approach:

		// WebElement emailId =driver.findElement(By.id("input-email"));
		// WebElement password = driver.findElement(By.id("input-password"));

		// emailId.sendKeys("ramya@gmail.com");
		// password.sendKeys("1234");

		// 3rd approach:By locator approach

		/*
		 * By eid= By.id("input-email"); By pwd = By.id("input-password");
		 * 
		 * WebElement emailId =driver.findElement(eid); WebElement
		 * password=driver.findElement(pwd);
		 * 
		 * 
		 * emailId.sendKeys("ramya@gmail.com"); 
		 * password.sendKeys("1234");
		 */

		// 4th approach : By locator + generic methods. 
	
		By eid = By.id("input-email");
		By pwd = By.id("input-password");
//		getElement(eid).sendKeys("ramya@gmail.com");
//		getElement(pwd).sendKeys("1234");
		
//		doSendKeys(eid,"ramya@gmail.com");
//		doSendKeys(pwd,"1234");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(eid, "ramya@gmail.com");
		eleUtil.doSendKeys(pwd,"1234");
		
		
		
	}

	
	
	
	

}
