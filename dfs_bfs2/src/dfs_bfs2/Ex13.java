package dfs_bfs2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//13. 섬나라 아일랜드(DFS)
public class Ex13 {
	static int answer = 0, n;
	static int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };
	static int[][] board;

	public static void DFS(int x, int y) {
		// 8방향 다음 갈수 있고 1일때 0바꿔주고 DFS
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (0 <= nx && nx < n && 0 <= ny && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx,ny);
			}
		}
	}

	public static void main(String[] args){
		Ex13 T = new Ex13();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		board=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j]=kb.nextInt();
			}
		}
		//board돌려 1이면 섬 추가 시작0 바꾸고 DFS
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(board[i][j]==1) {
					answer++;
					board[i][j]=0;
					DFS(i,j);
				}
			}
		}
		System.out.println(answer);
	}
}