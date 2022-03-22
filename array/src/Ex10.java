import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//10. ���츮
//�迭dx,dy
//answer 0
//���߹ݺ�
//�Ҹ����� nx,ny �����¿��ڸ����
//nxny�� �迭�����̸鼭 ���츮�ƴϸ�, false�ϰ� ����
//Ʈ��� ++
public class Ex10 {
	public static int solution(int n,int[][] arr) {
		int[] dx= {-1,1,0,0};
		int[] dy= {0,0,-1,1};
		int answer=0;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				boolean boo=true;
				for(int k=0;k<4;k++) {
					int nx=i+dx[k];
					int ny=j+dy[k];
					if(0<=nx && nx<n && 0<=ny && ny<n && arr[nx][ny]>=arr[i][j]) {
						boo=false;
						break;
					}
					
				}
				if(boo) answer++;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(solution(n,arr));
		
	}

}
