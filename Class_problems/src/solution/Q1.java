package solution;

import java.util.Scanner;

public class Q1 {
	public static int[] prefix_sum(int a[]) {
		int[] b = new int[a.length];
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum+=a[i];
			b[i]=sum;
		}
		return b;
	}
	public static void main(String args[]) {
		int[] a = {1,2,3,4,5};
		int[] prefix_sum = prefix_sum(a);
		int queries_number = new Scanner(System.in).nextInt();
		while(queries_number>0) {
			int i = new Scanner(System.in).nextInt();
			int j = new Scanner(System.in).nextInt();
			if ( i == 1){
				System.out.println(prefix_sum[j-1]);
			} else {
			System.out.println(prefix_sum[j-1]-prefix_sum[i-1]);
			}
			queries_number--;
		}
		
	}

}
