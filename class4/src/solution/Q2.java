package solution;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i =0;i<in;i++) {
			int num = sc.nextInt();
			if (num>max) {
				max = num;
			} 
			if (num < min) {
				min = num;
			}
				
		}
		System.out.println("Largest Number "+max);
		System.out.println("Smallest Number "+min);
			
		}
}
