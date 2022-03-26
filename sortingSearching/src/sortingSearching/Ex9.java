package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//10.마구간 정하기 결정알고리즘
//마구간 말 마구간 좌표 입력받아 최대거리리턴
//정렬해서 lt는 1 rt는 배열의 마지막 초기화
//rt가 크거나 같을 때 반으로 쪼갠게 최대거리
//count 함수 배열과 거리를 넘겨 말의 수보다 크거나 같으면 유효한거다
//쪼갠걸 답으로 하고 lt를 늘린다
//아니면  rt를 줄인다.
//
//count 함수는 배열과 거리를 넘겨받아 말의 수1로 초기화
//배열 0번째에 배치
//1부터 배열길이까지 반복 i번째와 기준점의 거리가 최대거리보다크거나 같으면 유효한것 
//cnt++하고 기준점을 i번쨰로 바꾼다.
public class Ex9 {
	public static int count(int[] arr, int dist) {
		int cnt=1;
		int ep=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]-ep>=dist){
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}
	
	public static int solution(int n,int c, int[] arr) {
		int answer=0;
		Arrays.sort(arr);
		int lt=1;
		int rt=arr[n-1];
		while(lt<=rt){
			int mid=(lt+rt)/2;
			if(count(arr, mid)>=c){
				answer=mid;
				lt=mid+1;
			}
			else rt=mid-1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=kb.nextInt();
		System.out.println(solution(n, c, arr));
	}

}