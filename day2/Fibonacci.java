package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit= 8;
		int a=0;
		int b=1;
		
		for (int i = 0; i <= limit; i++) {
			
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
				
		}
	}

}

/*
 i	a	sum	a 	b
0	0	1	1	1
1	1	2	1	2
3	1	3	2	3
4	2	5	3	5
5	3	8	5	8
6	5	13	8	13 */

