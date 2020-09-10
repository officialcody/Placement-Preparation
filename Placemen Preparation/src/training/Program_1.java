package training;

import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		for (int i = 0; i < 5; i++) {
			marks[i] = scan.nextInt();
		}
		int fetch = scan.nextInt();
		System.out.println(marks[fetch]);
		scan.close();
	}
}
