package Recursion;

public class Sub_SequenceII {
	
	public static void sub_sequence(String ques, String ans) {
		
		if(ques.equals("")) {
			System.out.println(ans);
			return;
		}
		
		
		sub_sequence(ques.substring(1),ans+ques.charAt(0));
		
		sub_sequence(ques.substring(1),ans);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub_sequence("abc","");
	}

}
