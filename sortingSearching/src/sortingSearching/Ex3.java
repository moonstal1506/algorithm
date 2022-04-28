package sortingSearching;

import java.util.Scanner;

//3. 삽입 정렬

public class Ex3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for (int i = 1; i < n; i++) {
			int tmp = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > tmp) {//tmp안썼더니
					arr[j + 1] = arr[j];//여기서 변경되어버린다
				} else {
					break;
				}
			}
			arr[j + 1] = tmp;
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}