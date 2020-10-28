package Recursion;

public class Ludo_II {
	
	public static void printPath(int ques, int n, String ans) {
		
		if (ques  == n) {
			System.out.println(ans+"-"+n);
			return;
		}
		
		if(ques > 10) {
			
			return ;
		}
		
		for(int i = 1;i<=6;i++) {
			printPath(ques+i,n,ans+"-"+Integer.toString(ques));
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPath(1,4,"");
	}

}
