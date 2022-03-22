import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//5. 소수
//n넘겨
//cnt는 0
//배열생성
//2부터 시작 
//초기에는 다 0이므로 0이면++
//반복으로 배수찾고 1넣음
public class Ex5 {
	public static int solution(int n) {
		int cnt=0;
		int[] a=new int[n+1];
		for(int i=2; i<n;i++) {
			if(a[i]==0) {
				cnt++;
				for(int j=i;j<n;j+=i) a[j]=1;
			}
			
		}
		return cnt;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(solution(n));
		
	}

}
