
public class Matrix_move_II {
	
	
	public static void moves(int row, int col, int n, String ans) {
		
		if(row ==n && col == n) {
			System.out.println(ans);
			return;
		}
		if(row> n || col > n) {
			return;
		}
		
		
		moves(row,col+1,n,ans+"H");
		moves(row+1,col,n,ans+"V");
		if (ans.length()!=0 && ans.charAt(ans.length()-1) != 'D') {
		moves(row+1,col+1,n,ans+"D");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moves(1,1,4,"");

	}

}
