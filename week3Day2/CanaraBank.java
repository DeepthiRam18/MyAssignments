package week3Day2;

public abstract class CanaraBank implements Payments {
	
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Cash on Delivery Available");		
		
	}

	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("UPI Payments are allowed");
		
	}

	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Card Payment is Accepted");
		
	}

	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet Banking facilityis Available");
		
	}

	public abstract void recordPaymentDetails();
}
