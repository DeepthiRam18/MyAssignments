package week3Day1;

public class Safari extends Browser {

	
	public void ereaderMode() {
		// TODO Auto-generated method stub
		
		System.out.println("Opening E- Reader Mode in Safari Sub Class");

	} 
	
	
	public void fullScreenMode() {
		// TODO Auto-generated method stub
		
		System.out.println("Entering Full Screen Mode in Safari Sub Class");

	}
	
	public static void main(String[] args) {
		
		Safari s=new Safari();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
		s.ereaderMode();
		s.fullScreenMode();
	}
}
