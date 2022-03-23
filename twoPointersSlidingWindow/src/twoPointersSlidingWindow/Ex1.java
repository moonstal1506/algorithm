package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;

//1.두배열합치기
//숫자입력 배열만들어 담아 두번진행
//nmab넘김
//어레이리스트
//포인터 두개 만들어
//하나가 끝날때까지 반복 비교해서 작은것 넣고 후위증가 포인터 옮겨주기
//나머지도 끝날때까지 넣기 답 리턴
public class Ex1 {
	private static ArrayList<Integer> solution(int n,int m, int[] a,int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0,p2=0;
		while(p1<n&&p2<m) {
			if(a[p1]<b[p2]) {
				answer.add(a[p1++]);
			}else {
				answer.add(b[p2++]);
			}
		}
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b= new int[m];
		for(int i=0;i<m;i++) {
			b[i]=kb.nextInt();
		}
		for(int x:solution(n,m,a,b))
			System.out.print(x+" ");
		
	}

}