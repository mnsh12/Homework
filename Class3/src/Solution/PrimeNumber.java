package Solution;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 2;
		boolean isPrime = true;
		while(i <= Math.sqrt(num)) {
			if (num % i == 0) {
				isPrime = false;
				System.out.println("No");
				break;
			}
			i++;
		}
		if (isPrime) {
			System.out.println("Yes");
		}
		
	}
	

}
