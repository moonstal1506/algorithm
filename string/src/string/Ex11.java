
package string;

import java.util.ArrayList;
import java.util.Scanner;

//11. 문자열압축
//answer 빈문자열 초기화
//문자열 뒤에 공백추가
//cnt 1로 초기화
//반복 길이-1까지
//뒤에 문자가 같으면 cnt증가
//다르면 answer에 문자추가
//cnt가 1보다 크면 answer에 cnt추가
//cnt1로 초기화
public class Ex11 {
	private static String solution(String s) {

		String answer = "";
		 s=s+" ";
		 int cnt =1;
		 for(int i=0;i<s.length()-1;i++) {
			 if(s.charAt(i)==s.charAt(i+1)) cnt++;
			 else {
				 answer+=s.charAt(i);
				 if(cnt>1) answer+=String.valueOf(cnt);
				 cnt=1;
			 }
		 }
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.print(solution(s));
	}

}
