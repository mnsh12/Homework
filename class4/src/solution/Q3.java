package solution;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=500; i++) {
			int sum = 0;
			int j = i;
			while(j!=0) {
				sum += (j%10)*(j%10)*(j%10);
				j = j/10;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}

	}

}
