package training;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		if (n < 3) {
			System.out.println("Invalid");
		} else if (n > 3 && !thirdMaxElement(arr)) {
			System.out.println("Invalid");
		} else {
			int temp = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[j] < arr[i]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println(arr[n - 3]);
		}
		scan.close();
	}

	private static boolean thirdMaxElement(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int e : arr) {
			set.add(e);
		}
		if (set.size() > 3) {
			return true;
		}
		return false;
	}
}
