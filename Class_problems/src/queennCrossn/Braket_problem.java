package queennCrossn;

public class Braket_problem {
	
	
	public static void get_all_combination(String s, int open_bracket, int close_bracket,String ans) {
		
		if (s.length() == 0) {
			if (open_bracket == close_bracket) {
				System.out.println(ans);
			
			}
			return;
		}
		if (close_bracket > open_bracket) {
			return;
		}
		
		char  c = s.charAt(0);
		if (c == '(') {
			get_all_combination(s.substring(1),open_bracket+1,close_bracket,ans + s.charAt(0));
		} else {
			
			get_all_combination(s.substring(1),open_bracket,close_bracket+1,ans + s.charAt(0));
			
		}
		
		get_all_combination(s.substring(1),open_bracket,close_bracket,ans );
		

		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "(()))";
		get_all_combination(s,0,0,"");
		
		
		
		
	}

}
