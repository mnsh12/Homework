import java.util.ArrayList;

public class Matrix_move {

	public static ArrayList<String> getPath(int row, int col, int n) {
		if (row == n && col == n) {
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			return al;
		}
		if (row > n || col > n) {
			return new ArrayList<>();
		}

		ArrayList<String> rr = getPath(row + 1, col, n);
		ArrayList<String> ms = new ArrayList<>();
		for (String ss : rr) {
			ms.add("V" + ss);
		}

		rr = getPath(row, col + 1, n);
		for (String ss : rr) {
			ms.add("H" + ss);
		}
		return ms;
	}

	public static ArrayList<String> getPath_With_Diagonal(int row, int col, int n) {
		if (row == n && col == n) {
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			return al;
		}
		if (row > n || col > n) {
			return new ArrayList<>();
		}

		ArrayList<String> rr = getPath_With_Diagonal(row + 1, col, n);
		ArrayList<String> ms = new ArrayList<>();
		for (String ss : rr) {
			ms.add("V" + ss);
		}

		rr = getPath_With_Diagonal(row, col + 1, n);
		for (String ss : rr) {
			ms.add("H" + ss);
		}

		rr = getPath_With_Diagonal(row + 1, col + 1, n);
		for (String ss : rr) {
			ms.add("D" + ss);
		}
		return ms;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stb

		System.out.println(getPath(1, 1, 3));

		// allow diagonal moves as well!!!

		System.out.print(getPath_With_Diagonal(1, 1, 3));

	}

}
