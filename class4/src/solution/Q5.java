package solution;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0.0;
		for (int i =1; i<=n;i++) {
			sum+= (double)1/i;
			
		}
		System.out.println(sum);
	}

}
