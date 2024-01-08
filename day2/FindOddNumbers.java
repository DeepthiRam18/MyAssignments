package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange=10;
		
		System.out.println("The Odd Numbers less than 10 are:");
		
		for (int i = 0; i < maxRange ; i++) {
			
			if (i%2==1) {
				System.out.println(i);
				
			}
			
		}

	}

}
