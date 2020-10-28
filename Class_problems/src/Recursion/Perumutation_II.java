package Recursion;

public class Perumutation_II {
	
	
	public static void getPermutationByPre(String ques, String ans) {
		
		if(ques.equals("")) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i =0 ; i<ques.length();i++) {
			getPermutationByPre(ques.substring(0,i)+ques.substring(i+1), ans + Character.toString(ques.charAt(i)));
			
		}
		return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		getPermutationByPre("abc","");
	}

}
