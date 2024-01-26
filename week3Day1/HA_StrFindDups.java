package week3Day1;

import java.util.ArrayList;
import java.util.Arrays;

import io.cucumber.java.mk_latn.No;

;

public class HA_StrFindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text ="We learn Java basics as part of java sessions in java week1";
		int count=0;
		
		String[] split = text.split(" ");
		
		ArrayList<String> ar = new ArrayList<String>();
		
		for(int i = 0; i < split.length; i++)
        {
			for (int j = 1; j < split.length; j++) {
				
			if(split[i]==split[j])
            ar.add(split[j]);
        }
			
		
        }
		System.out.println(ar);
	}
}