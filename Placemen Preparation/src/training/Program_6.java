package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program_6 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		String s = br.readLine();

		int[] inputs = new int[num];

		String[] s1 = s.split(" ");

		for (int i = 0; i < num; i++) {
			inputs[i] = Integer.parseInt(s1[i]);
		}

		Set<String> hs = new HashSet<String>();
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
			if (h >= 1) {
				hs.add(String.valueOf(inputs[u]));
			}
		}

		Iterator<String> i = hs.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

}
