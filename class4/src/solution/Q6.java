package solution;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0.0;
		for (int i =1; i<=n;i++) {
			if (i%2 == 0) {
			sum-= (double)1/i;
			} else {
				sum+= (double)1/i;
			}
		}
		System.out.println(sum);
	}
}
