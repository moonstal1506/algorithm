package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//6. 최대 길이 연속부분수열
//n개길이 k번 바꿀수 있다 입력받고
//n개 배열 생성 수열입력받기
//answer cnt lt 필요
//반복 rt n번 
//0이면 cnt++
//바꿀수 있는 횟수 초과 k번넘으면 lt움직일건데 0이면 cnt--해주고 lt++
//답은 최대값 길이계산rt-lt+1
public class Ex6 {
	private static int solution(int n,int k,int[] arr) {
		int answer=0,cnt=0,lt=0;
		for(int rt=0;rt<n;rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>k) {
				if(arr[lt]==0)cnt--;
				lt++;
			}
			answer=Math.max(answer, rt-lt+1);
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(solution(n,k,arr));
		
	}

}