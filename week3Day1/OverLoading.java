package week3Day1;

public class OverLoading {
	
	public void reportStep(String msg, String sts) {
		// TODO Auto-generated method stub
		System.out.println("The Message is :" + msg + "\n" + "The Status is:" + sts);
		}
	
	public void reportStep(String msg, String sts, Boolean snap) {
		System.out.println("The Message is :" + msg + "\n" + "The Status is:" + sts + "\n" + "Taking a SnapShot :" + snap);
		
	}
	
	public static void main(String[] args) {
		
		OverLoading ol=new OverLoading();
		ol.reportStep("Completed","Success");
		ol.reportStep("Error", "Pending", false);
		
	}
	
	
	
	

}
