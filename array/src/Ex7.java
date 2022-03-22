import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//7.점수계산
//n받고, 배열생성
//배열에 담아
//answer cnt
//반복
//1일때 ++ 답에 담기
//아닐때 cnt0초기화
public class Ex7 {

	
	public static int solution(int n,int[] arr) {
		int answer=0, cnt=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				cnt++;
				answer+=cnt;
			}
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(solution(n,arr));
		
	}

}
