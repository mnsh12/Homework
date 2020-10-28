package solution;

import java.util.ArrayList;
import java.util.List;

public class BirthDay {

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		int start = 0;
		int move = -1;
		int count = 0;
		int max = 0;
		int end = candles.size() - 1;
		if (candles.get(start) > candles.get(end)) {
			max = candles.get(start);
			move = 0;
			count++;
			start++;

		} else {
			max = candles.get(end);
			move = 1;
			end--;
			count++;
		}
		while (start <= end) {
			if (move == 0) {
				if (max < candles.get(start)) {
					move = 1;
					count = 1;
					max = candles.get(start);
					start++;
				} else if (max == candles.get(start)) {
					count++;
					start++;
				} else {
					start++;
				}
			} else {
				if (max < candles.get(end)) {
					move = 0;
					count = 1;
					max = candles.get(end);
					end--;
				} else if (max == candles.get(end)) {
					count++;
					end--;
				} else {
					end--;
				}

			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[] = { 12, 20, 3, 2, 1, 3, 12 };
		int a [] = {12,12,12,12,12,12};
		ArrayList<Integer> al = new ArrayList<>();
		for (int i : a) {
			al.add(i);
		}

		System.out.println(birthdayCakeCandles(al));
	}

}
