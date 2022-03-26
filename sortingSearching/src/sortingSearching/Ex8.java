package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//8. 이분검색
//n개 숫자 m을 찾아서 위치리턴
//오름차순 정렬후 lt rt
//rt가 크거나 같을 때 까지
//절반을 쪼개 m과 같은지 비교 해서 맞으면 답
//m보다 크면 rt를 줄이고
//작으면 lt를 늘린다.

public class Ex8 {
	
	private static int solution(int n,int m, int[] arr) {
		int answer=0;
		Arrays.sort(arr);
		int lt=0, rt=n-1;
		while(lt<=rt) {
			int mid=(lt+rt)/2;
			if(arr[mid]==m) {
				answer=mid+1;
				break;
			}
			if(arr[mid]>m) rt=mid-1;
			else lt=mid+1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=kb.nextInt();
		System.out.println(solution(n, m, arr));
	}

}