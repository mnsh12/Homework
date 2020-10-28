package queennCrossn;

public class Possible_point {

	
	
	
	public static void get_possible_path(int arr[][],String ans,int fsf) {
		
		
		//base condition
		
	if(fsf == arr.length) {
		System.out.println(ans);
		return;
	}

	for(int col =0;col<arr.length;col++) {
		
		if (is_valid_position(arr,col,fsf)) {
			arr[fsf][col] = 1;
			get_possible_path(arr,ans + " R"+fsf+" C "+col,fsf+1);
			arr[fsf][col] = 0;
			
		}
			
		}
	}
	
		
		
		
		
		
	private static boolean is_valid_position(int[][] arr, int col, int fsf) {
		// TODO Auto-generated method stub
		
		
		// for check in all row
		for(int i = 0;i<fsf;i++) {
		 if (arr[i][col] == 1) {
			 return false;
		 }
			
		}
		int i =  fsf -1;
		int j  = col -1;
		
		// primary diagonal
		while(i>=0 && j>=0) {
			if (arr[i][j] == 1) {
				return false;
			}
			i--;
			j--;
			
		}
		// Secondary Diagonal
		
		 i = fsf -1;
		 j =  col +1;
		while(i >=0 && j < arr.length) {
			if (arr[i][j] == 1) {
				return false;
			}
			j++;
			i--;
		}
		
		
		
		
		
		return true;
	}






	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		
	  get_possible_path(arr,"",0);
	}

}
