package week3Day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="TestLeaf";
		
		System.out.print("The Reversed String is: ");
		
		char[] d1= companyName.toCharArray();
		
		for (int i = d1.length-1; i >= 0; i--) {
			
			System.out.print(d1[i]);
			
		}
		
		
		
		
	}

}
