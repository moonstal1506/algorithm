package sortingSearching;

import java.util.Scanner;

//4.Least Recently Used
public class Ex4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		int[] cache = new int[s];
		for (int i = 0; i < n; i++) {
			int pos = -1;
			for (int j = 0; j < s; j++) {
				if (arr[i] == cache[j]) {
					pos = j;
				}
			}

			if (pos == -1) {
				for (int j = s - 1; j >= 1; j--) {
					cache[j] = cache[j - 1];
				}
			} else {
				for (int j = pos; j >= 1; j--) {
					cache[j] = cache[j - 1];
				}
			}
			cache[0] = arr[i];
		}

		for (int x : cache) {
			System.out.print(x + " ");
		}
	}
}