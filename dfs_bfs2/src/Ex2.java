
import java.util.Scanner;

//2. 바둑이 승차(DFS)
public class Ex2 {
	static int answer = 0;
	static int c, n;

	public void DFS(int L, int sum, int[] arr) {
		if (sum > c)
			return;
		if (L == n) {
			answer = Math.max(answer, sum);
		} else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
	}

	public static void main(String[] args) {
		Ex2 T = new Ex2();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}