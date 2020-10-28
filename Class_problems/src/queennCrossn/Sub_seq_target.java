package queennCrossn;

public class Sub_seq_target {
	
	
	public static void subset_sum(int []arr, int vix, int target, String ans ) {
		
		if(vix == arr.length) {
			if(target == 0) {
				System.out.println(ans);
			}
			return ;
		}
		if (target < 0) {
			return ;
		}

		subset_sum(arr,vix+1,target -  arr[vix],ans+arr[vix]);
		subset_sum(arr,vix+1,target, ans);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,9};
		subset_sum(a,0,13,"");
		

	}

}
