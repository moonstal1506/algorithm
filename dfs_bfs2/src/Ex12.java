
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//12.토마토
public class Ex12 {
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static int[][] board, dis;
	static int n, m;
	static Queue<Point> Q=new LinkedList<>();//main에서도 접근 static
	public void BFS(){
		while(!Q.isEmpty()){
			Point tmp=Q.poll();
			for(int i=0; i<4; i++){
				int nx=tmp.x+dx[i];
				int ny=tmp.y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){
					board[nx][ny]=1;
					Q.offer(new Point(nx, ny));//익은거 넣어주고
					dis[nx][ny]=dis[tmp.x][tmp.y]+1;// 날짜+1
				}
			}
		}	
	}

	public static void main(String[] args){
		Ex12 T = new Ex12();
		Scanner kb = new Scanner(System.in);
		m=kb.nextInt();
		n=kb.nextInt();
		board=new int[n][m];
		dis=new int[n][m];
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				board[i][j]=kb.nextInt();
				if(board[i][j]==1) Q.offer(new Point(i, j));//익은 것들 위치 넣어두기
			}
		}
		T.BFS();
		boolean flag=true;
		int answer=Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(board[i][j]==0) flag=false;//익지 않은게 있다
			}
		}
		if(flag){//익었으면
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					answer=Math.max(answer, dis[i][j]);//dis판에 익은 날짜 적힌거
				}
			}
			System.out.println(answer);
		}
		else System.out.println(-1);
	}
}

//class Point{
//	public int x, y;
//	Point(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
//}