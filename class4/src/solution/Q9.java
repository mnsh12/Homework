package solution;

import java.util.Scanner;

public class Q9 {
	public static int fact(int n) {
		int sum  = 1;
		for (int i =1;i<=n;i++) {
			sum*=i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		double sum =1;
		for(int i =1;i<n;i++) {
			if (i%2==0) {
				sum+=(double)Math.pow(x, 2*i)/fact(2*i);
			}else {
				sum-=(double)Math.pow(x, 2*i)/fact(2*i);
				
			}
		}
		System.out.println(sum);
		
		
	}
}
