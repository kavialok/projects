package snippet;

import java.util.Scanner;

public class AllStringPermutations {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String[] ar = new String[n];

		int i = 0;
		while (in.hasNext()) {
			ar[i] = in.next();
			System.out.println("original string  " + ar[i]);

			printAllPermutations(ar[i], 0, ar[i].length() - 1);
			i++;
		}

		in.close();
		System.exit(0);
	}

	// backtracking method
	public static void printAllPermutations(String str, int left, int right) {

		if (left == right) {
			System.out.println("permuted string  " + str);
		} else {
			for (int i = left; i <= right; i++) {           // right -left
				str = Utility.swap(str, left, i);           // constant
				printAllPermutations(str, left+1, right);   // right -left -1
				str = Utility.swap(str, left, i);           // constant
			}
		}
	}

}
// runtime n*n!