package kubalka;

import java.util.ArrayList;
import java.util.List;

public class LongestSequence {

	public static List<Integer> findSeq(int[] numToProcess) {

		List<Integer> longestSeq = new ArrayList<Integer>();
		List<Integer> currNumbSeq = new ArrayList<Integer>();

		for (int i = 0; i < numToProcess.length; i++) {
			int currentNumber = numToProcess[i];
			int nextNum = 0;

			// hlídá, aby nextNum nepřekročilo hranice tabulky a nehodilo to
			// chybu
			if (i != numToProcess.length - 1) {
				nextNum = numToProcess[i + 1];
			}

			currNumbSeq.add(currentNumber);

			if (currentNumber >= nextNum || currentNumber + 1 != nextNum || i == numToProcess.length - 1) {
				if (currNumbSeq.size() > longestSeq.size()) {
					longestSeq.clear();
					longestSeq.addAll(currNumbSeq);
				}

				currNumbSeq.clear();
			}
		}

		return longestSeq;
	}

	public static void main(String[] arguments) {
		// int[] a = { 1, 2, 3, 4, 0, 20, 1, 1, 2, 2, 3, 3, 2 };
		// int[] a = { 1, 2, 3, 4, 0, 20, 1, 2, 3, 4, 5};
		// int[] a = { 1, 2, 3, 4, 10, 30, 1, 1, 2, 2, 3, 3, 2 };
		// int[] a = { 4, 5, 6, 6, 1, 2, -1};
		int[] a = { 1, 2, 3, 4, 6, 7, 10, 12 };
		// int[] a = {1, 2, 3, 4, 10, 7 ,6, 10, 12};
		// int[] a = {2, 3, 4, 1, 50, 2, 3, 4, 5};
		// int[] a = {5, -1, 10, 20, 3, 4};
		// int[] a = {2, -3, -2, -1, -2, 10, 20};
		// int[] a = {2, -3, -2, 6, -1, 0, 1, 20};
		// int[] a = {4, 5, 1, 2, -1};
		// int[] a = {2,6, 3, 8, 7, 6, 7, 8, 9, 1, 1, 2, 3, 3};

		System.out.println(findSeq(a));

	}

}
