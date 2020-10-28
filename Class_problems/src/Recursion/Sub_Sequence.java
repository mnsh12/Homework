package Recursion;

import java.util.ArrayList;

public class Sub_Sequence {

	static ArrayList<String> sequence_array(String s) {

		if (s.length() == 0) {
			ArrayList<String> toreturn = new ArrayList<>();
			toreturn.add("");
			return toreturn;
		}

		char current = s.charAt(0);
		String sub_s = s.substring(1);
		ArrayList<String> rr = sequence_array(sub_s);
		ArrayList<String> ms = new ArrayList<>();
		for (String p : rr) {
			ms.add(p);
			ms.add(current + p);
		}
		return ms;

	}

// array permutation	
	static ArrayList<String> sequence_array_permutation(String s) {

		if (s.length() == 0) {
			ArrayList<String> toreturn = new ArrayList<>();
			toreturn.add("");
			return toreturn;
		}

		char current = s.charAt(0);
		String sub_s = s.substring(1);
		ArrayList<String> rr = sequence_array_permutation(sub_s);
		ArrayList<String> ms = new ArrayList<>();
		for (String p : rr) {

			for (int c = 0; c <= p.length(); c++) {

				String prefix = p.substring(0, c);
				String postfix = p.substring(c);
				ms.add(prefix + current + postfix);

			}

		}
		return ms;

	}

	// quwery keyword

	public static ArrayList<String> get_combinal_message(String numbers) {
		if (numbers.length() == 1) {
			ArrayList<String> al = new ArrayList<>();
			String s = getChoice(numbers.charAt(0));
			for(int c= 0;c<s.length();c++) {
				//al.add(Character.toString((String)s[c]));
				al.add(Character.toString((s.charAt(c))));
			}
			return al;

		}

		char c = numbers.charAt(0);
		String sc = getChoice(c);
		String ss = numbers.substring(1);

		ArrayList<String> al = get_combinal_message(ss);
		ArrayList<String> fl = new ArrayList<>();
		for (String a : al) {
			for(int i = 0;i<sc.length();i++) {
			fl.add(a+sc.charAt(i));
			}
		}
		return fl;

	}

	public static String getChoice(char key) {
		if (key == '1') {
			return "abc";
		}
		if (key == '2') {
			return "def";
		}
		if (key == '3') {
			return "ghi";
		}
		if (key == '4') {
			return "jkl";
		}
		if (key == '5') {
			return "mno";
		}
		if (key == '6') {
			return "pqrs";
		}
		if (key == '7') {
			return "tuv";
		}
		if (key == '8') {
			return "wx";
		}
		if (key == '9') {
			return "yz";
		}
		if (key == '0') {
			return ".;";
		}
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(get_combinal_message("234"));

	}

}
