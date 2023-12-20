package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NARegistrationPage {

	static WebDriver driver;

	public static void main(String[] args) {

		AssignmentBrowserUtil aBrUtil = new AssignmentBrowserUtil();
		driver = aBrUtil.launchBrowser("chrome");
		aBrUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		aBrUtil.getTitle();

		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By confPwd = By.id("input-confirm");
		By continueBtn = By.className("btn-primary");
		By headerText = By.tagName("h1");
		By chkBox = By.xpath("//input[@type='checkbox']");

		AssignmentUtil aUtil = new AssignmentUtil(driver);
		aUtil.doSendKeys(fName, "Avyu");
		aUtil.doSendKeys(lName, "Sai");
		aUtil.doSendKeys(email, "avyusai@gmail.com");
		aUtil.doSendKeys(telephone, "6565657");
		aUtil.doSendKeys(pwd, "sai123");
		aUtil.doSendKeys(confPwd, "sai123");
		// aUtil.doClick(chkBox);
		aUtil.doClick(continueBtn);
		aUtil.doElementGetText(headerText);
		String fNameVal = aUtil.doGetAttribute(fName, "value");

		aUtil.doGetAttribute(lName, "value");

//		String placeholderVal = driver.findElement(email).getAttribute("placeholder");
//		System.out.println(placeholderVal);	
		
		List<WebElement> textElements = driver.findElements(By.className(".form-control"));
		
		

	}

}
