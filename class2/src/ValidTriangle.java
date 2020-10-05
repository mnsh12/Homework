import java.util.Scanner;

public class ValidTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a+b+c == 180) {
			System.out.println("Valid");
		}else {
			System.out.println("Not valid");
		}
		
	}

}
