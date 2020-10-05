package Solution;

import java.util.Scanner;

public class SumProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c;
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			c = sc.nextInt();
			System.out.println(a+b);
		} while( c==1 );
	}

}
