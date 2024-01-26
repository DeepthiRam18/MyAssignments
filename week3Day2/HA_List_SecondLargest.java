package week3Day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HA_List_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
				int[] a= {3,2,11,4,6,7};
				
				List<Integer> al= new ArrayList<Integer>();
				
				for (int i = 0; i < a.length; i++) {
					al.add(a[i]);
				}
				
				
				Collections.sort(al);
				
				System.out.println("The Sorted List is:" + al);
				
				int size = al.size();
				
				Integer secLarge = al.get(size-2);
				
				System.out.println("The Second Largest in the List: "+ secLarge);
							

			}
	}


