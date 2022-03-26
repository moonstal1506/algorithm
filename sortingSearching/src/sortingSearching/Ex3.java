package sortingSearching;

import java.util.Scanner;

//3.삽입정렬 뒤에서 앞으로 오면서 비교
//1 부터시작 임시변수는 i자리 j도 밖에서 선언
//i의 앞에서 0보다 작거나 같을때까지 줄어들면서 반복
//임시변수보다크면 뒤에 넣어줌 아니면 반복문 나와
//멈춘지점+1한곳에 임시변수 넣음

public class Ex3 {
	private static int[] solution(int n, int[] arr) {
		for(int i=1;i<n;i++) {
			int tmp=arr[i],j;
			for(j=i-1;j>=0;j--) {
				if(arr[j]>tmp) arr[j+1]=arr[j];
				else break;
			}
			arr[j+1]=tmp;
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