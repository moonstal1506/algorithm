import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//8. 등수구하기
//answer배열 n개 생성
//cnt 1등
//나보다 큰애 있으면 ++
//답에 cnt 담기
public class Ex8 {
	public static int[] solution(int n,int[] arr) {
		int[] answer= new int[n];
		for(int i=0;i<n;i++) {
			int cnt=1;
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) cnt++;
			}
			answer[i]=cnt;
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
		for(int x:solution(n,arr) )
		System.out.print(x+" ");
		
	}

}
