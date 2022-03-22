import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//10. 봉우리
//배열dx,dy
//answer 0
//삼중반복
//불린선언 nx,ny 상하좌우자리계산
//nxny가 배열범위이면서 봉우리아니면, false하고 멈춤
//트루면 ++
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
