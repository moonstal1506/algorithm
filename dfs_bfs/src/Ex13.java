import java.util.ArrayList;
import java.util.Scanner;

//13. 경로탐색(인접리스트, ArrayList)
public class Ex13 {
	static int n;
	static int m;
	static int answer = 0;
	static ArrayList<ArrayList<Integer>> arr;
	static int[] ch;

	private void DFS(int v) {
		if (v == n) {
			answer++;
		} else {
			for (int i : arr.get(v)) {
				if (ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Ex13 T = new Ex13();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		arr= new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < m; i++) {
			arr.get(kb.nextInt()).add(kb.nextInt());
		}

		ch = new int[n + 1];
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);

	}

}