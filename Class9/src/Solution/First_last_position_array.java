package Solution;

public class First_last_position_array {
	public static  int[] searchRange(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		int a[] = { -1, -1 };
		while (start <= end) {

			int mid = (start + end) / 2;

			if (nums[mid] == target) {

				int i = mid;
				while (i + 1 < nums.length && nums[i + 1] == target) {
					i++;
				}
				a[1] = i;
				i = mid;
				while (i - 1 >= 0 && nums[i - 1] == target) {
					i--;
				}
				a[0] = i;

				return a;
			} else if (nums[mid] < target) {

				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3 };

		int b[] = searchRange(a, 1);
		for (int c : b) {
			System.out.println(c);
		}
	}

}
