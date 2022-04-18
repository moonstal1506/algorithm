import java.util.Scanner;

//10. 봉우리
public class Ex10 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		int[] nx = { -1, 1, 0, 0 };
		int[] ny = { 0, 0, 1, -1 };
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean isBong = true;
				for (int k = 0; k < 4; k++) {
					int x = i + nx[k];
					int y = j + ny[k];
					if (0 <= x && x < n && 0 <= y && y < n && arr[x][y] >= arr[i][j]) {
						isBong = false;
						break;
					}
				}
				if (isBong) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
