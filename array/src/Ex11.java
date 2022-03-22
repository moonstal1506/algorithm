import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//11. 임시반장정하기
//n을 받아서 1부터 시작하는 2차원배열 5개의 반
//1부터시작하는 반복문 숫자담아서 넘겨
//answer랑 max선언
//1부터 삼중반복 cnt선언 5반까지
//반이 같으면 ++하고 나와
//max보다 크면 바꿔 걔번호가 답
//왜 1번부터 시작? 학생번호 1번시작 학생번호 리턴
public class Ex11 {
	public static int solution(int n,int[][] arr) {
		int answer=0,max=0;
		for(int i=1;i<=n;i++) {
			int cnt=0;
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=5;k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(max<cnt) {
				max=cnt;
				answer=i;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(solution(n,arr));
		
	}

}
