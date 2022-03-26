package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//5. 중복확인 
//답을 u로 초기화
//정렬
//뒤에꺼랑 비교해서 같으면 답d로 바꾸고 멈춤
//답 리턴
public class Ex5 {
	private static String solution(int n, int[] arr) {
		String answer="U";
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				answer="D";
				break;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
			System.out.print(solution(n,arr));
	}

}