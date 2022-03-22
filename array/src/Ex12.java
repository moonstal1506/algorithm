import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//12.멘토링
//m번의 테스트 n명
//4중포문
//answer
//학생 짝 경우의 수
//cnt
//m번
//멘토 멘티 등수변수
//경우의 수랑 같은 학생찾으면 변수에 넣고 등수비교해서 ++
//m번 충족시 answer++
public class Ex12 {
	public static int solution(int n,int m,int[][] arr) {
		int answer=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			int cnt=0;
				for(int k=0;k<m;k++) {
					int pi=0, pj=0;
					for(int s=0; s<n; s++){
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m) {
					answer++;
				}
				
			}
			
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(solution(n,m,arr));
		
	}

}
