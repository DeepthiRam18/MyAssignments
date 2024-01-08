package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=31;
		
		if(num==2 || num==3 || num==5 || num==7) {
			System.out.println("Num is Prime--");
		}
		else{
			
		
			if (num%2!=0 && num%3!=0 && num%5!=0) {
			
			System.out.println("Num is Prime");
			}			
			else {
			System.out.println("Num is NOT Prime");
		    }
		
		}
		
		
		//int i,num,count;
		/* System.out.println("The prime numbers less than 50 are: ");
		
		for (num = 1; num <= 50; num++) {
			
			count=0;
			for (i= 2; i <= num/2; i++) {
				if(num%i==0) {
					count++;
					break;
					
				}
			}
			if(count==0 && num!=1) {
				System.out.println(num + " ");
			}
			
		} */

	}

}
