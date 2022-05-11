package dfs_bfs2;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//11. 미로의 최단거리 통로(BFS)
public class Ex11 {
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static int[][] board, dis;
	
	
	public void BFS(int x, int y){
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x,y));
		board[x][y]=1;
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int i=0;i<4;i++) {
				int nx= p.x+dx[i];
				int ny= p.y+dy[i];
				if(1<=nx&&nx<=7&&1<=ny&&ny<=7&& board[nx][ny]==0) {
					board[nx][ny]=1;
					q.add(new Point(nx,ny));
					dis[nx][ny]=dis[p.x][p.y]+1;
				}
			}
			
		}
	}

	public static void main(String[] args){
		Ex11 T = new Ex11();
		Scanner kb = new Scanner(System.in);
		board=new int[8][8];
		dis=new int[8][8];
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				board[i][j]=kb.nextInt();
			}
		}
		T.BFS(1, 1);
		if(dis[7][7]==0) {
			System.out.println(-1);
		}else {
			System.out.println(dis[7][7]);
		}
	}
}
