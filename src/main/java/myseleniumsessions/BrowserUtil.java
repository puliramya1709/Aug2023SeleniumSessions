package myseleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * BrowserUtil is having multiple generic methods to handle various browser actions.
 */
public class BrowserUtil {

	private WebDriver driver;

/**
 * This method is used to launch the browser based on the given browser name
 * @param browserName
 * @return This returns the driver instance
 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Browser Name is: " + browserName);

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass the right browser name");
			throw new AutomationException("Invalid Browser" + browserName);

		}
		return driver;
	}
/**
 * This method is used to launch URL
 * @param url
 */
	public void launchURL(String url) {

		if (url == null) {
			System.out.println("URL is null");
			throw new AutomationException("Null URL");
		}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new AutomationException("Http is missing");
		}
	}
/**
 * This method is use to find the title of the page
 * @return : title
 */

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Title name is: " +title);
		return title;
	}
/**
 * 
 * @return currentURL
 */
	public String getPageURL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentURL is: " +currentUrl);
		return currentUrl;
	}

	public boolean getPgSource(String value) {
		String pageSource = driver.getPageSource();
		if (pageSource.contains(value)) {
			return true;
		}
		return false;
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed");
	}

	public void quitBrowser() {
		driver.quit();
		System.out.println("Browser closed");	
	}

}
