package string;

import java.util.Scanner;
//Ex2
public class Ex2 {
	private String solution(String str) {
		String answer="";
		for(char ch:str.toCharArray()) {
//			if(Character.isLowerCase(ch)) {
//				answer+=Character.toUpperCase(ch);
//			}else {
//				answer+=Character.toLowerCase(ch);
//			}
			
			if('a'<=ch&&ch<='z') {
				answer+=Character.toUpperCase(ch);
			}else {
				answer+=Character.toLowerCase(ch);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Ex2 T = new Ex2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

	

}
