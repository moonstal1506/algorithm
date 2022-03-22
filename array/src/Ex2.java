
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//2.보이는 학생
//첫번째는 걍 입력,
//max비교해서 크면 ++ , max값 변경
public class Ex2 {
	private static int solution(int n, int[] arr) {
		int answer=1, max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			} 
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		
			System.out.print(solution(n,arr));
		
	}

}