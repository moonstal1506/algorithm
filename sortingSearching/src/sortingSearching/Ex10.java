package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//9. 뮤직비디오 결정 알고리즘
//9개를 3개로 담는데 최소용량리턴
//lt는 최대값 rt는 총합으로 초기화
//rt가 크거나 같을 때까지 중간구해서 count 함수에 넣어
//3보다 작거나 같으면 rt를 줄인다
//아니면 lt를 늘린다
//
//count함수는 배열과 용량을 넘겨받는데
//cnt는 1로초기화 sum은 0
//배열 돌려서 더한게 용량보다 클때 cnt++ sum은 x로 초기화하고
//아니면 sum에 누적해준다. 반복이 끝나면 cnt를 리턴한다.

public class Ex10 {
	public static int count(int[] arr, int capacity) {
		int cnt=1, sum=0;
		for(int x: arr) {
			if(sum+x>capacity) {
				cnt++;
				sum=x;
			}
			else sum+=x;
		}
		return cnt;
	}
	
	public static int solution(int n,int m, int[] arr) {
		int answer=0;
		int lt=Arrays.stream(arr).max().getAsInt();
		int rt=Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid=(lt+rt)/2;
			if(count(arr,mid)<=m) {
				answer=mid;
				rt=mid-1;
			}
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