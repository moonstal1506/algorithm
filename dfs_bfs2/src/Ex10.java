
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//10.�̷� Ž��
public class Ex10 {
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static int[][] board;
	static int answer=0;

	public void DFS(int x, int y){
		if(x==7 && y==7) answer++; //����
		else{
			for(int i=0; i<4; i++){//4���� ���� Ȯ��
				int nx=x+dx[i];//������ ���ϱ�
				int ny=y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){//�����ִ� ������ Ȯ�� ��� ���ȿ� �ְ� �湮���� �ʾҴ� ��
					board[nx][ny]=1;//üũ
					DFS(nx, ny);
					board[nx][ny]=0;//���ƿö� ���
				}
			}
		}	
	}

	public static void main(String[] args){
		Ex10 T = new Ex10();
		Scanner kb = new Scanner(System.in);
		board=new int[8][8];//1����7���� �������ϱ� 8���������
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				board[i][j]=kb.nextInt();
			}
		}
		board[1][1]=1;//��������
		T.DFS(1, 1);
		System.out.print(answer);
	}
}