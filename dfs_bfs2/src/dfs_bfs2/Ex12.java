package dfs_bfs2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//12. 토마토(BFS)
public class Ex12 {
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] board, dis;
	static int n, m;
	static Queue<Point> q = new LinkedList<>();

	public void BFS() {
		while (!q.isEmpty()) {
			Point p = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if (0 <= nx && nx < n && 0 <= ny && ny < m && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					q.add(new Point(nx,ny));
					dis[nx][ny]=dis[p.x][p.y]+1;
				}
			}

		}
	}

	public static void main(String[] args) {
		Ex12 T = new Ex12();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		board = new int[n][m];
		dis = new int[n][m];
		// board채우면서 1이면 큐넣기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j] = kb.nextInt();
				if (board[i][j] == 1) {
					q.add(new Point(i, j));
				}
			}
		}

		// BFS호출
		T.BFS();
		// board 0찾기 안익은거 있으면 false
		boolean flag = true;
		for(int i=0; i<n;i++) {
			for(int j=0;j<m;j++) {
				if(board[i][j]==0) {
					flag=false;
				}
			}
		}
		
		// 다익었으면 거리 최소값
		int answer=0;
		if(flag) {
			for(int i=0; i<n;i++) {
				for(int j=0;j<m;j++) {
					answer=Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		}else {
			System.out.println(-1);
		}

		// 아니면 -1

	}
}
