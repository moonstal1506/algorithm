
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//10.미로 탐색
public class Ex10 {
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static int[][] board;
	static int answer=0;

	public void DFS(int x, int y){
		if(x==7 && y==7) answer++; //도착
		else{
			for(int i=0; i<4; i++){//4개의 방향 확인
				int nx=x+dx[i];//갈방향 정하기
				int ny=y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){//갈수있는 곳인지 확인 행과 열안에 있고 방문하지 않았던 곳
					board[nx][ny]=1;//체크
					DFS(nx, ny);
					board[nx][ny]=0;//돌아올땐 취소
				}
			}
		}	
	}

	public static void main(String[] args){
		Ex10 T = new Ex10();
		Scanner kb = new Scanner(System.in);
		board=new int[8][8];//1부터7까지 넣을꺼니까 8개만들어줌
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				board[i][j]=kb.nextInt();
			}
		}
		board[1][1]=1;//시작지점
		T.DFS(1, 1);
		System.out.print(answer);
	}
}