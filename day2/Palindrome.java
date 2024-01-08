package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1001;
		int rev=0;
		int orig,bal;
		
		orig=n;
		
		while (n!=0) {
			bal=n%10;
			rev=rev*10+bal;
			n=n/10;
		}
		if(orig==rev) {
			System.out.println("Palindrome");
	}
		else {
			System.out.println("Not A Palindrome");
		}
	}
}

/*
iteration while-n!=0	bal	rev	n
12321		t			1	1	1232
1232		t			2	12	123
123			t			3	123	12
12			t			2	1232 1
1			t			1	12321 0
0 			f	*/
