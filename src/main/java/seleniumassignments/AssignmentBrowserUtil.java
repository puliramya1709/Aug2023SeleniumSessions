package seleniumassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentBrowserUtil {

	private WebDriver driver;

	public WebDriver launchBrowser(String browserName) {
		System.out.println("Browser name given is :" + browserName);

		switch (browserName.toLowerCase().trim()) {
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
			System.out.println("please pass the right browser name");
			throw new AutoException("Invalid Browser : " + browserName);

		}
return driver;
	}
	
	public void launchURL(String URL) {
		if(URL == null) {
			System.out.println("URL is Null");
			throw new AutoException("Null URL");
		}
		if(URL.indexOf("http")==0) {
			driver.get(URL);
		}
		else {
			throw new AutoException("HTTP is missing");
			
		}
	}
	public String getTitle() {
		String title = driver.getTitle();
		System.out.println("Title is :" +title);
		return title;
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
