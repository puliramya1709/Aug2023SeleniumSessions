package myseleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* WebDriver driver = new ChromeDriver();

 	driver.get("https://google.com");
 	String title = driver.getTitle();
 	System.out.println(title);
 	if(title.equalsIgnoreCase("Google")) {
 	System.out.println("Pass");
 
	}
 	else{
 		System.out.println("Not matching");
 	}
 	driver.quit();*/

 	String browser ="chrome";
 	
 	switch(browser.toLowerCase().trim()) {
 	
 	case "chrome":
 		
 		driver = new ChromeDriver();
 		break;
 		
 	case "edge":
 		driver = new EdgeDriver();
 		break;
	case "firefox":
 		driver = new FirefoxDriver();
 		break;
	case "default":
		System.out.println("please pass the right browser");
		break;

 		
 	}
 	
 	driver.get("https://google.com");
 	String title = driver.getTitle();
 	System.out.println(title);
 	if(title.equalsIgnoreCase("Google")) {
 	System.out.println("Pass");
 
	}
 	else{
 		System.out.println("Not matching");
 	}
 	driver.quit();
 	
}

}
