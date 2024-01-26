package week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HA_List_MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,10,6,8};
		
		//adding array into List
		
		List<Integer> al= new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		
		//Sorting
		
		Collections.sort(al);
		
		System.out.println("The Sorted List is:" + al);
		
		int size = al.size();
		
		System.out.print("The Missing Number in the List is: ");
		
		for (int i = 0; i < size-1; i++) {
			
			int currNum= al.get(i) + 1;
			if(currNum != al.get(i+1)) {
				System.out.print(currNum + " ");
			}
				
		}

	}

}
