package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//3.최대매출
//n과 k입력
//n개 배열 생성
//answer sum초기화
//k만큼 더해서 answer에 담아
//옆에것 더하고 k만큼 앞에있는것 빼서
//옆으로 옮겨가면서 최대값비교
public class Ex3 {
	private static int solution(int n,int k, int[] a) {
		int answer=0,sum=0;
		for(int i=0;i<k;i++) {
			sum+=a[i];
		}
		answer=sum;
		for(int i=k;i<n;i++) {
			sum=sum+(a[i]-a[i-k]);
			answer=Math.max(answer, sum);
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		
			System.out.print(solution(n,k,a));
		
	}

}