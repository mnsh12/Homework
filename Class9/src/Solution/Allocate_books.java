package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Allocate_books {

	public static int _max(ArrayList<Integer> A, int mid, int b) {
		// 10 20 30 10 10
		// 50 2
		int i = 1;

		int sum = 0;
		for (int k : A) {

			if (i > b) {
				return -1;
			}
			if (sum + k <= mid) {
				sum += k;
			} else {
				if (i == b) {
					return -1;
				}
				if (k > mid) {
					return -1;
				}

				sum = k;
				i++;

			}
		}
		return 1;
	}

	static int largest(int[] arr, int n) {
		Arrays.sort(arr);
		return arr[n - 1];
	}

	public static  int books(ArrayList<Integer> A, int B) {
	        int min = 0;
	        int max = 0;
         
	        int ans = 0;
	        if(A.size() == B){
			return Collections.max(A);
	        	
	        	
	        	
			} else if(A.size()-1<B) {
				
				return -1;
			}  
			
			System.out.println("Run");
	        
            
               for(int  i =0;i<A.size();i++) {
        	   if (min > A.get(i)) {
        		   min = A.get(i);
        	   }
        	   max += A.get(i);
           }
           int mid;// = (min+max)/2;
           while(min<= max ) {
        	   mid = (min+max)/2;
        	  int check =  _max(A,mid,B);
        	  
        	  if (check == 1) {
        		  max = mid-1;
        		  ans = mid;
        	  }
        	  else {
        		  min = mid +1;
        	  }
        	   
           }
           return ans;
               
	   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a [] = { 12, 34, 67, 90 };
		// int a[] = { 10, 20, 30, 40 };
		// int a[] = { 97, 26, 12, 67, 10, 33, 79, 49, 79, 21, 67, 72, 93, 36, 85, 45,
		// 28, 91, 94, 57, 1, 53, 8, 44, 68, 90, 24};
		int a[] = { 22 };
		ArrayList<Integer> al = new ArrayList<>();
		for (int i : a) {
			al.add(i);
		}
		System.out.println("ma");
		System.out.println(books(al, 1));

	}

}
