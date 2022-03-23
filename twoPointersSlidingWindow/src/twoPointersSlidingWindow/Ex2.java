package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//2. 공통원소
//어레이리스트에 담을거임
//넘겨받은 배열 정렬
//포인터 만들어 하나 끝날때까지 
//같으면 담고 포인터2개다 증가
//아니면 작은수의 포인터 증가

public class Ex2 {
	private static ArrayList<Integer> solution(int n,int m, int[] a,int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0,p2=0;
		while(p1<n&&p2<m) {
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;	
		}
		
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