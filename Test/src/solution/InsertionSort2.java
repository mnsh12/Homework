package solution;

public class InsertionSort2 {

	static void print(int n[]) {
		for (int i : n) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// Complete the insertionSort2 function below.
	static void insertionSort2(int n, int[] arr) {
		int swap = 0;
		for (int i = 1; i < n; i++) {
			for (int j = i ; j > 0; j--) {
				if (arr[j-1] > arr[j]) {
					// swap
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swap = 1;
				} else {
					continue;
				}
			}

				print(arr);
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 4, 3, 5, 6, 2,3,4,3 };
		insertionSort2(a.length, a);

	}

}
