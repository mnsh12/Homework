package Recursion;

import java.util.ArrayList;

public class Ludo {
	
	
	public static ArrayList<String> give_path(int start, int end){
		
		if(start == end) {
			ArrayList <String> al =  new ArrayList<>();
			al.add(Integer.toString(end));
			return al;
		}
		if(start > end) {
			ArrayList <String> al =  new ArrayList<>();
			
			return al;
		}
		
		
		ArrayList<String> ml =  new ArrayList<>();
		for(int i = 1;i<=6;i++) {
			ArrayList<String> rr = give_path(start+i,end);
			for(String element:rr) {
				ml.add(Integer.toString(start)+"-"+element);
				
			}
		}
		return ml;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(give_path(1,10));

	}

}
