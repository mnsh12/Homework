package solution;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;

		int i = 3;
		if (n>=2) {
			System.out.print("0 1 ");
		}	else if (n >=1) {
			System.out.println("0 ");
		}
		while(i<=n) {

			System.out.print((a+b)+" ");
			int k = b;
			b = a+b;
			a =k;

			i++;
			
		
		
		}
		

}}

