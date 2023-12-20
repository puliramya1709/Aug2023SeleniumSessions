package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AssignmentUtil {
	private WebDriver driver;

	public AssignmentUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doElementGetText(By locator) {
		String text = getElement(locator).getText();
		System.out.println(text);
		return text;
	}
	
	public String doGetAttribute(By locator, String attrName) {
		String attrVal = getElement(locator).getAttribute(attrName);
		System.out.println(attrVal);
		return attrVal;
	}
	

	public boolean isDropdownMultiple(By locator) {
		Select select = new Select(driver.findElement(locator));
		return select.isMultiple() ? true : false;

	}

	public void selectDropDownMultipleValues(By locator, String... values) {
		Select select = new Select(driver.findElement(locator));	
	
	}
}

