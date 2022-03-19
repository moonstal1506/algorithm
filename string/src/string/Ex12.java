package string;

import java.util.ArrayList;
import java.util.Scanner;

//12.
//answer 초기화
//반복 n번
//문자7까지 자르고 replace로 변경
//2진수로 변환
//char로 형변환 answer에 담기
//앞에7개 잘라내기
public class Ex12 {
	private static String solution(int n, String s) {
		String answer = "";
		for(int i=0;i<n;i++) {
			String tmp= s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp,2);
			answer+=(char)num;
			s=s.substring(7);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s= kb.next();
		System.out.print(solution(n,s));
	}

}
