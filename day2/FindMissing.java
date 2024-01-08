package week1.day2;
import java.util.Arrays;

public class FindMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,7,9,2,4,8}; 
		Arrays.sort(a);		
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=i+1) {
				System.out.println(i+1);
				break;
				
				
			}
		}

	}

}
