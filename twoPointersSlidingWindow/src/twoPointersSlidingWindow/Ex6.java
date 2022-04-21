package twoPointersSlidingWindow;

import java.util.Scanner;

//6. 최대 길이 연속부분수열
public class Ex6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		int cnt = 0;
		int lt = 0;
		int answer = 0;
		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] == 0) {
				cnt++;
			}
			while (cnt > k) {
				if (arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		System.out.println(answer);
	}
}