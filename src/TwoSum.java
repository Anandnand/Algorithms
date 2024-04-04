import java.util.Scanner;


// TIME COMPLEXITY  = O(n^2)

public class TwoSum {
	public static int[] twoSum(int arr[], int n, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
		int target = 12;
		int result[] = twoSum(arr, arr.length, target);

		if (result.length == 0) {
			System.out.println("The target value is not found.");
		} else {
			for (int i : result) {
				System.out.print(i + " ");
			}
		}
	}

}
