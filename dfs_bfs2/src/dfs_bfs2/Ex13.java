package dfs_bfs2;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//13. ������ ���Ϸ���DFS
public class Ex13 {
	static int answer=0, n;
	static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};//8����
	static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
	public void DFS(int x, int y, int[][] board){
		for(int i=0; i<8; i++){//�������ϱ�
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){//�����϶���!!
				board[nx][ny]=0;
				DFS(nx, ny, board);
			}
		}	
	}
	public void solution(int[][] board){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(board[i][j]==1){//������ ã�Ҵ�
					answer++;
					board[i][j]=0;//������ 0���� �ٲ��ֱ�
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