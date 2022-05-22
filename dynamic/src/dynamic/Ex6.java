package dynamic;

import java.util.Scanner;

//6. 최대점수 구하기(냅색알고리즘)
public class Ex6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] dy = new int[m + 1];
		for (int i = 0; i < n; i++) {
			int ps = kb.nextInt();
			int pt = kb.nextInt();
			// 뒤에서 부터, 중복해서 푸는 것 방지
			for (int j = m; j >= pt; j--) {
				dy[j] = Math.max(dy[j], dy[j - pt] + ps);
			}
		}
		System.out.print(dy[m]);
	}
}