package Recursion;

// using pre method approach
public class key_pad_problem {

	public static String getChoice(char key) {
		if (key == '2') {
			return "abc";
		}
		if (key == '3') {
			return "def";
		}
		if (key == '4') {
			return "ghi";
		}
		if (key == '5') {
			return "jkl";
		}
		if (key == '6') {
			return "mno";
		}
		if (key == '7') {
			return "pqrs";
		}
		if (key == '8') {
			return "tuv";
		}
		if (key == '9') {
			return "wxyz";
		}

		return "";
	}

	public static void get_message(String ques, String ans) {
		
		if (ques.equals("")) {
			System.out.println(ans);
			return;
			
		} 
		    char c = ques.charAt(0);
		   String msg = getChoice(c);
		   for(int i = 0;i<msg.length();i++) {
			   
			get_message(ques.substring(1),ans + msg.charAt(i));
		   }
		   return;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get_message("234","");
	}

}
