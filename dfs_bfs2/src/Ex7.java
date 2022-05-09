
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//7. 조합수(메모이제이션)
//nCr=n-1Cr-1 + n-1Cr

public class Ex7 {
	int[][] dy = new int[35][35];

	public int DFS(int n, int r) {
		if (dy[n][r] > 0) {
			return dy[n][r];
		}
		if (n == r || r == 0) {
			return 1;
		} else {
			return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
		}
	}

	public static void main(String[] args) {
		Ex7 T = new Ex7();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));
	}
}