package week3Day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HA_List_IntersecOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		
		List<Integer> al1= new ArrayList<Integer>();
		List<Integer> al2= new ArrayList<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			
		al1.add(arr1[i]);
		
		}
		
		System.out.println("The values in List 1:" +al1);
		
		for (int j = 0; j < arr2.length; j++) {
			
			al2.add(arr2[j]);
			
		}
		
		System.out.println("The values in List 2:" + al2);
		
		System.out.print("The Common Values found are :");
		
		for(int data : al1) {
			
			for (int data1 : al2) {
				
				if(data==data1) {
					
							
					System.out.print(data + " ");
				}
			}
		}
		

}
}
