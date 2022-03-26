package sortingSearching;

import java.util.Scanner;

//4.Least Recently Used
//크기와 개수 배열 입력 받아 배열 출력
//캐시 배열만들고 입력받은 배열돌려 인덱스 -1로초기화
//사이즈만큼 반복 캐시에 이미 존재하면 인덱스를 캐시자리로 변경
//-1이면 캐시에 없었다는 뜻 뒤에서부터  앞에서 뒤로 땡겨준다
//캐시에 있었다면 캐시가 있던 자리부터 땡김
//0번째 자리엔 그게 와야한다.
public class Ex4 {
	private static int[] solution(int s, int n, int[] arr) {
		int[] cache = new int[s];
		for(int x: arr) {
			int pos=-1;
			for(int i=0;i<s;i++) if(x==cache[i]) pos=i; 
			if(pos==-1) {
				for(int i=s-1;i>=1;i--) {
					cache[i]=cache[i-1];
				}
			}
			else {
				for(int i=pos;i>=1;i--) {
					cache[i]=cache[i-1];
				}
			}
			cache[0]=x;
		}
		return cache;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		for(int x:solution(s,n,arr)) {
			System.out.print(x+" ");
			
		}
		
	}

}