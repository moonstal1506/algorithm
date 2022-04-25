package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//3. 크레인 인형뽑기(카카오)
public class Ex3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = kb.nextInt();
		}

		Stack<Integer> stack = new Stack<>();
		int cnt = 0;
		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos - 1] != 0) {
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0;
					if (!stack.isEmpty() && stack.peek() == tmp) {
						cnt += 2;
						stack.pop();
					} else {
						stack.push(tmp);
					}
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}
