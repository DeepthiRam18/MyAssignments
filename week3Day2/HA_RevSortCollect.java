package week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HA_RevSortCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] comp={"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> compList= new ArrayList<String>();
		
			
		for (int i = 0; i < comp.length ; i++) {
			
			compList.add(comp[i]);
			
		}
		
		int size = compList.size();
		
		System.out.println("The Size of the List is: " + size);
		
		Collections.sort(compList);
		
		System.out.println("The Sorted List in Ascending Order is:" +compList);
		
		System.out.print("The List in Descending Order is:");
		for (int j = size-1; j >=0; j--) {
			
			String revList = compList.get(j);
			System.out.print(revList + ",");
			
		}

		
	}

}
