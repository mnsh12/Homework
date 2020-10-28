package Solution;

public class Search_in_rotational_array {

	 public static int search(int[] nums, int target) {
	         for(int i=0;i<nums.length;i++){
	             if( nums[i]== target ){
	                 return i;
	             }
	         }
	         return -1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,3,4};
		search(a,4);

	}

}
