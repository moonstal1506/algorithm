package sortingSearching;

import java.util.Scanner;
//1. 선택정렬
//숫자 개수 입력 받아 배열 생성 후 입력 배열 리턴
//이중포문 인덱스를 i로 초기화하고 내부 반복문은 그 뒤부터 돌려
//인덱스보다 작으면 인덱스를 바꿔준다
//i자리와 인덱스자리를 바꾼다.
public class Ex1 {
	private static int[] solution(int n, int[] arr) {
		for(int i=0;i<n;i++) {
			int idx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[idx]) idx=j;//가장 작은것 찾기
			}
			int tmp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=tmp;
		}
		return arr;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		for(int x:solution(n,arr)) {
			System.out.print(x+" ");
			
		}
		
	}

}