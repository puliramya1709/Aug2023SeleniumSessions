package seleniumassignments;

public class AmazonPage {

	public static void main(String[] args) {
		AssignmentBrowserUtil AbrUtil= new AssignmentBrowserUtil();
		AbrUtil.launchBrowser("chrome");
		AbrUtil.launchURL("https://www.amazon.ae/");
		AbrUtil.getTitle();
		

	}

}
