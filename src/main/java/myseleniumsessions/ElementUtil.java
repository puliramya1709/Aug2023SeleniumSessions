package myseleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * This method is used for String locator
	 */
	public By getBy(String locatorType, String locatorValue) {
		By by = null;
		switch (locatorType.toLowerCase().trim()) {
		case "id":
			By.id(locatorValue);
			break;
		case "name":
			By.name(locatorValue);
			break;
		case "class":
			By.className(locatorValue);
			break;
		case "xpath":
			By.xpath(locatorValue);
			break;
		case "css":
			By.cssSelector(locatorValue);
			break;
		case "linktext":
			By.linkText(locatorValue);
			break;
		case "partiallinktext":
			By.partialLinkText(locatorValue);
			break;
		case "tag":
			By.tagName(locatorValue);
			break;
		default:
			System.out.println("Incorrect locator type passed" +locatorType);
			throw new AutomationException("Wrong Locator Type");
			
		}
		
		return by;
	}
	
	public void doSendkeys(String locatorType, String locatorValue, String value) {
		getElement(getBy(locatorType,locatorValue)).sendKeys(value);
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
