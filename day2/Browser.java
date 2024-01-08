package week1.day2;

public class Browser {
	String launchBrowser(String browserName){
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application URL Loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser lb=new Browser();
		System.out.println(lb.launchBrowser("Chrome"));
		lb.loadUrl();
	}

}
