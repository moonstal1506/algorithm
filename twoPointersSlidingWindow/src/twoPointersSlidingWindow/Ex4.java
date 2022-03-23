package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//4.연속 부분수열
//answer, sum lt초기화
//rt를 n까지 돌려
//sum에 누적 m과 같으면 답++
//sum이 m보다 크거나 같을때 lt옮기면서 빼기 반복 
//같아지면 답++
public class Ex4 {
	private static int solution(int n,int m, int[] a) {
		int answer=0,sum=0,lt=0;
		for(int rt=0; rt<n;rt++) {
			sum+=a[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=a[lt++];
				if(sum==m) answer++;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		System.out.print(solution(n,m,a));
		
	}

}