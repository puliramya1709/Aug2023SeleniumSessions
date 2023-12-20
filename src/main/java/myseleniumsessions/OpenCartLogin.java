package myseleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLogin {

	WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.getPageTitle();
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By eid = By.id("input-email");
		By pwd = By.id("input-password");
		By header = By.tagName("h2");
		
		eleUtil.doSendKeys(eid, "ramya@gmail.com");
		eleUtil.doSendKeys(pwd, "1234test");
		String headerValue = eleUtil.doElementGetText(header);
		if(headerValue.equals("New Customer")) {
			System.out.println("Header matching");
		}
		else {
			System.out.println("Header not matching");
		}
		
		
		brUtil.closeBrowser();
		

		
	}

}
