
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//4. 피보나치 재귀(메모이제이션)
public class Ex4 {

	// public static int DFS(int n) {
	//
	// if (n == 1) {
	// return 1;
	// } else if (n == 2) {
	// return 1;
	// } else {
	// return DFS(n - 2) + DFS(n - 1);
	// }
	//
	// }
	//
	// public static void main(String[] args) {
	// int n = 5;
	// for (int i = 1; i <= n; i++) {
	// System.out.print(DFS(i)+" ");
	// }
	// }

	static int[] fibo;

	public static int DFS(int n) {
		if(fibo[n]!=0) {
			return fibo[n];
		}
		if (n == 1) {
			return fibo[n] = 1;
		} else if (n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
		}

	}

	public static void main(String[] args) {
		int n = 5;
		fibo = new int[n + 1];
		DFS(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}

}