package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//8. 이분검색

public class Ex8 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		Arrays.sort(arr);
		int lt = 0;
		int rt = n - 1;
		int answer = 0;
		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (arr[mid] == m) {
				answer = mid + 1;
				break;
			} else if (arr[mid] > m) {
				rt = mid - 1;
			} else {
				lt= mid+1;
			}
		}
		System.out.println(answer);
	}

}