package myseleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/");
		String actTitle = brUtil.getPageTitle();
		if(actTitle.equals("Your Store")) {
			System.out.println("Title matching : Pass");
		}
		else {
			System.out.println("Title not matching");
		}
		String actURL = brUtil.getPageURL();
		if(actURL.contains("opencart")) {
			System.out.println("URL is correct : Pass");
		}
		
		brUtil.closeBrowser();
		
	}

}
