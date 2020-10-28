package solution;

public class Max_SubArray {
	
	  static int[] maxSubarray(int[] arr) {
	        
	        long max_sum = 0;
	        int all_negative = 0;
	        long current_sum = arr[0];
	        long total_sum = arr[0];
	        for(int i:arr){
	            if(i >= 0){
	                all_negative = 1;
	                max_sum+=(long)i;
	            }
	        }
	        
	        for(int i=1;i<arr.length;i++){
	            
	            
	            if(current_sum+(long)+arr[i] > (long)arr[i]){
	                current_sum+=(long)arr[i];
	            } else{
	                current_sum = (long)arr[i];
	            }
	            if(current_sum> total_sum){
	                total_sum = current_sum;
	            }
	            
	        }
	       if (all_negative == 0){
	           max_sum = -1;
	           total_sum = -1;
	       } 
	        int result[] = {(int)total_sum,(int)max_sum};
	        return result;
	        
	        


	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {-1,-2,-3,-4,0};
		int a[] = {-1,0};
		int rr[] = maxSubarray(a);
		for(int i:rr) {
			System.out.print(i+" ");
		}
	}

}
