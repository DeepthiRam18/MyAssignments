package week3Day2;

public class Amazon extends CanaraBank {

	
	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment Mode/ Details are recorded");
		
	}
	
	public static void main(String[] args) {
		Amazon az= new Amazon();
		az.cardPayments();
		az.cashOnDelivery();
		az.internetBanking();
		az.upiPayments();
		az.recordPaymentDetails();
	}

}
