package week3Day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class HA_StrOddIndex {
	
	public static void main(String[] args) {
		
		String test="changeme";
		
		char[] c = test.toCharArray();
		
		
		
		for (int i = 0; i < c.length; i++) {
			
		if(i%2!=0) {
		//ArrayList<Character> c1= new ArrayList<Character>();
			
			char upperCase = Character.toUpperCase(c[i]);
			System.out.print(upperCase);
			
		
		}
		else {
			System.out.print(c[i]);
		}
		
		}
	}
}
