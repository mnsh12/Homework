import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int avg = (sub1 + sub2 + sub3)/3;
		if (avg>= 90 && avg <=100) {
			System.out.println("A");
		}else if (avg >=89 && avg <=80) {
			System.out.println("B");
		}else if (avg >= 70 && avg <= 79) {
			System.out.println("C");
		}else if (avg >= 60 && avg <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		

	}

}
