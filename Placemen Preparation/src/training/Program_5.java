package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_5 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		String s = br.readLine();

		int[] inputs = new int[num];

		String[] s1 = s.split(" ");

		for (int i = 0; i < num; i++) {
			inputs[i] = Integer.parseInt(s1[i]);
		}

		int gg = find(inputs);
		if (gg == 0) {
			System.out.println("All elements are repeated");
		} else {
			System.out.println(inputs[gg]);
		}
	}

	private static int find(int[] inputs) {
		for (int u = 0; u < inputs.length; u++) {
			int val = inputs[u];
			int h = 0;
			for (int y = 0; y < inputs.length; y++) {
				if (y != u) {
					if (inputs[y] == val) {
						h++;
						continue;
					}
				}
			}
			if (h == 0) {
				return u;
			}
		}
		return 0;

	}
}
