package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//5-1.연속된 자연수의 합
//앞문제와 동일하지만 입력받은 숫자로 배열을 만들어야한다.
//최대가 n/2+1이다
//배열 생성
//rt를 m번 돌려 sum
//n과 같으면 ++
//sum이 크거나 같을때 
//lt빼고 움직여 같은지 확인 반복

//5-2.
//15를 2개 연속된 수 만들려면 1,2/3개 수 1,2,3 더해서 빼준뒤 cnt개의 수로 나눴을 때 나머지가 0이면 가능


public class Ex5 {
	private static int solution(int n) {
//		int answer=0,sum=0,lt=0;
//		int m =n/2+1;
//		int[] a=new int[m];
//		for(int i=0; i<m;i++) {
//			a[i]=i+1;
//		}
//		for(int rt=0;rt<m;rt++) {
//			sum+=a[rt];
//			if(sum==n) answer++;
//			while(sum>=n) {
//				sum-=a[lt++];
//				if(sum==n) answer++;
//			}
//		}
		
		int answer=0, cnt=1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0)answer++;
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(solution(n));
		
	}

}