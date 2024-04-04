//TIME COMPLEXITY=o(n^2)

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumWater {
	public static int storingWater(ArrayList<Integer> height) {
		int max = 0;
		for (int i = 0; i < height.size(); i++) {
			for (int j = i + 1; j < height.size(); j++) {
				int high = Math.min(height.get(i), height.get(j));
				int width = j - i;
				int currWater = high * width;
				max = Math.max(max, currWater);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> height = new ArrayList<>();
		height.add(8);
		height.add(7);
		height.add(9);
		height.add(3);
		height.add(2);
		height.add(1);
		height.add(9);

		System.out.println(height);
		System.out.println("The maximum water can be stored is");
		System.out.println(storingWater(height));
	}

}