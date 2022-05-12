package dfs_bfs2;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//13. 섬나라 아일랜드BFS
public class Ex13_2 {
	
	static int answer=0, n;
	static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
	static int[][] board;
	
	//큐 포인트 추가 비어있을 때까지 포인트 빼서 8방향 돌려 갈수 있으면 0바꾸고 큐에 추가
	public static void BFS(int x, int y){
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x,y));
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int i=0;i<8;i++) {
				int nx= p.x+dx[i];
				int ny= p.y+dy[i];
				if(0<=nx&&nx<n&&0<=ny&&ny<n&&board[nx][ny]==1) {
					board[nx][ny]=0;
					q.add(new Point(nx,ny));
				}
			}
		}
	}

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		board=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j]=kb.nextInt();
			}
		}
		//board 돌려 1이면 섬추가 0바꾸고 BFS
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(board[i][j]==1) {
					answer++;
					board[i][j]=0;
					BFS(i,j);
				}
				
			}
		}
		
		System.out.println(answer);
	}
}
