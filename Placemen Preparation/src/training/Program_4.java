package training;

public class Program_4 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 6, 3 };

		int i = mostVotes(arr);
		System.out.println(i);
	}

	private static int mostVotes(int[] votesPerUser) {
		int i;

		int max = votesPerUser[0];
		int index = 0;

		for (i = 1; i < votesPerUser.length; i++)
			if (votesPerUser[i] > max) {
				max = votesPerUser[i];
				index = i;
			}

		return index;
	}
}
