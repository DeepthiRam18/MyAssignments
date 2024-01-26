package week3Day1;

public class Edge extends Browser {
	
	public void takeSnap() {
		// TODO Auto-generated method stub
		
		System.out.println("Taking a Snap in Edge SubClass");

	} 
	
	
	public void clearCookies() {
		// TODO Auto-generated method stub
		System.out.println("Clearing Cookies in Edge SubClass");
	}
	
	public static void main(String[] args) {
		Edge e= new Edge();
		
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.takeSnap();
		e.clearCookies();

}
}