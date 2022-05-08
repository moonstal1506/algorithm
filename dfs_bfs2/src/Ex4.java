
import java.util.Scanner;

//4.중복순열
public class Ex4 {
	static int[] pm;
	static int n, m;

	public void DFS(int L) {// 0->1->2
		if (L == m) {// 2
			for (int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				pm[L] = i;// 0 1->1 1
				DFS(L + 1);// 1->2
			}
		}
	}

	public static void main(String[] args) {
		Ex4 T = new Ex4();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pm = new int[m];
		T.DFS(0);
	}
}