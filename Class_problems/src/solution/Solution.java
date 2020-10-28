package solution;

public class Solution {
	
	
	public static int[] max(int a[]) {
		int max =Integer.MIN_VALUE;
		int indx = 0;
		for(int i=0;i<a.length;i++) {
			if (a[i]>max) {
				max = a[i];
				indx = i;
			}
		}
		int result[] = {indx,max};
		return result;
	}
	
	public static int[] list_of_smaller_number(int a[], int k,int vix) {
		if (vix == a.length) {
			return  new int[k];
		}
		int rr[] =list_of_smaller_number(a,k,vix+1);
		if (k+vix>a.length-1) {
			rr[a.length-1-vix]= a[vix];
			
		} else {
			int b[] = max(rr);
			if (b[1]>a[vix]) {
				rr[b[0]] = a[vix];
				return rr;
			}
			return rr;
		}
		return rr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5, 9, 3, 6, 2, 1, 3, 2, 7, 5};
		int b[]=list_of_smaller_number(a,8,0);
		for(int i:b) {
			System.out.println(i);
		}
	}

}
