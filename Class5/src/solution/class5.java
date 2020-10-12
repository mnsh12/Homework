package solution;

import java.util.Scanner;

public class class5 {

	public static void main(String args[]) {
		
		
		
		int[] b = {7,6,4,3,1};
		Scanner sc = new Scanner(System.in);
		int i  = sc.nextInt();
		int j = sc.nextInt();
		
		
		maxProfit(b,i,j);

		
		
		
	}
    public static void maxProfit(int[] arr, int i, int j) {
    	int sum = 0;
        for(int k = i-1;k<j;k++) {
        	sum+=arr[k];
        }
        System.out.println(sum);
        
    }
	
	 
	
		
	}
	

