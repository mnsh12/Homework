package solution;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		int queries_number = new Scanner(System.in).nextInt();
		long a[]= new long[11];
		while(queries_number>0) {
			int i = new Scanner(System.in).nextInt();
			int j = new Scanner(System.in).nextInt();
			int k = new Scanner(System.in).nextInt();
			
			a[i]=k;
			if (j<10) {
				a[j]-=k;
			}
			queries_number--;
		}
		for(int i = 1 ;i<=10;i++) {
			a[i]=a[i]+a[i-1];
			System.out.println(a[i]);
		}
		long max =0;
		for(long i:a) {
			if (max< i) {
				max= i;
			}
			
		}
		System.out.println(max);
		
	}
}
