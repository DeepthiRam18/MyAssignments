package week3Day1;

public class HA_Str_RevOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="I am a Software Tester";
		String[] strArr = test.split(" ");
		
		for (int i = 0; i < strArr.length; i++) {
			if(i%2!=0) {
				char[] charArray = strArr[i].toCharArray();
				for (int j = charArray.length-1; j >=0 ; j--) {
												
					System.out.print(charArray[j]);
								
				}
				
				System.out.print(" ");
			
			}
			
			else {
				
				System.out.print(strArr[i] + " ");
			}
				
		}
	}
				
		}
		
		
			
		

	


