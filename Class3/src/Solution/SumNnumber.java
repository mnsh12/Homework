package Solution;

import java.util.Scanner;

public class SumNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		int num = sc.nextInt();
		while(i <= num) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
