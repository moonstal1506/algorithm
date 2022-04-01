
import java.util.ArrayList;
import java.util.Scanner;

//14. 피자배달DFS
//피자집조합구하기 6C4
//거리구하기 
//합에 누적
//합 최소

public class Ex14 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> hs, pz;

	public void DFS(int L, int s) {
		if (L == m) {// 살려야할 피자집 개수 4 다 됐을 때 조합완성
			int sum = 0;
			for (Point h : hs) {// 집이 기준이었다.
				int dis = Integer.MAX_VALUE;
				for (int i : combi) {// 인덱스번호
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		} else {
			for (int i = s; i < len; i++) {// 조합 피자집 개수6개
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		Ex14 T = new Ex14();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if (tmp == 1)
					hs.add(new Point(i, j));
				else if (tmp == 2)
					pz.add(new Point(i, j));
			}
		}
		len = pz.size();
		combi = new int[m];
		T.DFS(0, 0);
		System.out.println(answer);
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}