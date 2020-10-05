package Solution;

import java.util.Scanner;

public class EvenOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Sum_even = 0;
		int Sum_odd  = 0;
		System.out.println("Enter the count of integers");
		int N = sc.nextInt();
		for (int i = 0; i<N; i++) {
		int num = sc.nextInt();
		if (num % 2 == 0) {
			Sum_even += num; 
		} else {
			Sum_odd += num;
		}

		}
		System.out.print(Sum_even);
		System.out.print(Sum_odd);
	}

}
