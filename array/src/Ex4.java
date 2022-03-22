
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//4.피보나치 수열
//숫자입력 넘겨
//answer 배열
//0,1은 1이다
//반복문 i-2랑i-1 더한게 i
//public class Ex4 {
//	public static int[] solution(int n) {
//		int[] answer= new int[n];
//		answer[0]=1;
//		answer[1]=1;
//		for(int i=2; i<n; i++) {
//			answer[i]=answer[i-2]+answer[i-1];
//		}
//		return answer;
//	}
// 
//	public static void main(String[] args) {
//		Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
//	
//		for(int x:solution(n) )
//			System.out.print(x+" ");
//		
//	}
//
//}


//바로출력 a1b2c선언 ab먼저출력
//c만들고 a는b로 b는c로
public class Ex4 {
	public static void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		solution(n);
		
	}

}