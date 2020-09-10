package training;

import java.util.Scanner;

public class Program_3 {
	public static void fizzBuzz(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
				System.out.print(" FizzBuzz");
			} else if (arr[i] % 3 == 0) {
				System.out.print(" Fizz");
			} else if (arr[i] % 5 == 0) {
				System.out.print(" Buzz");
			} else {
				System.out.print(" " + arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = { 2, 3, 5, 8, 12, 15, 16 };
		fizzBuzz(arr);
		scan.close();
	}
}
