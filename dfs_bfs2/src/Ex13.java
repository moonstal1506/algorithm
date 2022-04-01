
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//13. 섬나라 아일랜드DFS
public class Ex13 {
	static int answer=0, n;
	static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};//8방향
	static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
	public void DFS(int x, int y, int[][] board){
		for(int i=0; i<8; i++){//방향정하기
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){//육지일때만!!
				board[nx][ny]=0;
				DFS(nx, ny, board);
			}
		}	
	}
	public void solution(int[][] board){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(board[i][j]==1){//육지를 찾았다
					answer++;
					board[i][j]=0;//시작점 0으로 바꿔주기
					DFS(i, j, board);
				}
			}
		}	
	}

	public static void main(String[] args){
		Ex13 T = new Ex13();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		T.solution(arr);
		System.out.println(answer);
	}
}