package week3Day1;

public class Chrome extends Browser {
	
	public void openIncognito() {
		// TODO Auto-generated method stub
		
		System.out.println("Opening Incognito mode in Chrome Sub Class");

	}
	
	
	public void clearCache() {
		// TODO Auto-generated method stub
		
		System.out.println("Clearing Cache in Chrome Sub Class");

	}
	
	public static void main(String[] args) {
		
		Chrome chr= new Chrome();
		
		System.out.println(chr.browserName);
		System.out.println(chr.browserVersion);
		chr.openURL();
		chr.closeBrowser();
		chr.navigateBack();
		chr.clearCache();
		chr.openIncognito();
		
		
	}

}
