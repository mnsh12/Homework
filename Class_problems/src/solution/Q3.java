package solution;

public class Q3 {
	
	public static void main(String args[]) {
		
		int a [] = {1,1,0,1,1,0,1,1,0,0,1,1,0};
		
		int startIndex = 0;
		int endIndex = a.length-1;
		while(startIndex<= endIndex) {
			if (a[startIndex]==0) {
				startIndex++;
			}	else if(a[endIndex]==1) {
				endIndex--;
			}	else {
				a[startIndex]=0;
				a[endIndex]=1;
				startIndex++;
				endIndex--;
			}
		}
		for(int i: a) {
			System.out.print(i);
		}
		

}
}
