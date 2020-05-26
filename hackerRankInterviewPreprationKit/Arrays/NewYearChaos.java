package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NewYearChaos {

	// Complete the minimumBribes function below.
	static int minimumBribes(int[] q) {

		int ans = 0;
		for (int i = q.length - 1; i >= 0; i--) {
			int ch_pos = q[i] - (i + 1);
			if (ch_pos > 2) {
				System.out.println("too");
				return 0;
			} else {
				int st = Math.max(0, q[i] - 2);
				for (int j = st; j < i; j++) {
					if (q[j] > q[i])
						ans++;
				}
			}
		}
		return ans;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] q1 = { 2, 5, 1, 3, 4 };
		int count = minimumBribes(q1);
		System.out.println(count);
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}

}
