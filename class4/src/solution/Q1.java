package solution;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int positive_count = 0;
		int negative_count = 0;
		int zero_count = 0;
		for (int i =0;i<in;i++) {
			int num = sc.nextInt();
			if (num>0) {
				positive_count+=1;
				
			} else if (num < 0) {
				negative_count+=1;
			} else {
				zero_count+=1;
			}
			
		}
		System.out.println("Positive Number : "+positive_count);
		System.out.println("Negative Number : "+negative_count);
		System.out.println("Zero            : "+zero_count);
		
	}
}

