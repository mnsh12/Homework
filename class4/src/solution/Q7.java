package solution;

import java.util.Scanner;

public class Q7 {
	
	public static void number(int n) {
		for(int i = n/2+1;i>1;i--) {
			System.out.print(i);
		}
		for(int i = 1;i<=n/2+1;i++) {
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		switch(n) {
		case "i":
			for(int i = 0; i< 5;i++) {
				System.out.println("*********");
				
			}
			break;
		case "ii":
			for(int i = 0; i< 5;i++) {
				for(int j = 0; j< i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case "iii":
			for(int i = 0; i< 5;i++) {
				for(int j = 2*(5-i)-2; j> 0;j--) {
					System.out.print(" ");

				}
				for(int j = 0; j< i;j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			break;

		case "iv":
			for(int i = 0; i< 5;i++) {
				for(int j = 2*(5-i)-2; j> 0;j--) {
					System.out.print(" ");

				}
				for(int j = 0; j< 2*i-1;j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			break;	
			
		case "v":
			for(int i = 1; i<= 5;i++) {
				for(int j = 2*(6-i)-2; j> 0;j--) {
					System.out.print(" ");

				}
				for(int j = 1; j<= 2*i-1;j++) {
					System.out.print(i);
				}
			System.out.println();
			}
			break;	
		case "vi":
			for(int i = 1; i<= 5;i++) {
				for(int j = 2*(6-i)-2; j> 0;j--) {
					System.out.print(" ");

				}
				number(2*i-1);
			System.out.println();
			}
			break;	
		}
	}

}
