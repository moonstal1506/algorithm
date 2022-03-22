import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//9. 격자판 최대합
//n줄의 2차원배열만들어 넣어준다.
//n줄과 배열넘겨
//answer에 최소값
//sum1,2초기화
//이중반복 행,열
//답에 최대값
//다시 초기화 
//대각선
//답에 최대값
public class Ex9 {
	public static int solution(int n,int[][] arr) {
		int answer= Integer.MIN_VALUE;
		int sum1,sum2;
		for(int i=0;i<n;i++) {
			sum1=sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer=Math.max(answer, sum1);
			answer=Math.max(answer, sum2);
		}
		sum1=sum2=0;
		for(int i=0;i<n;i++) {
				sum1+=arr[i][i];
				sum2+=arr[i][n-i-1];
			
		}
		answer=Math.max(answer, sum1);
		answer=Math.max(answer, sum2);
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
