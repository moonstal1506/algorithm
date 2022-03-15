package string;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Ex1 T = new Ex1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c=kb.next().charAt(0);
		System.out.println(T.solution(str,c));
	}

	private int solution(String str, char c) {
		int answer=0;
		str=str.toUpperCase();
		c=Character.toUpperCase(c);
//		for(int i =0; i<str.length();i++) {
//		if(str.charAt(i)==c) {
//			answer++;
//		}
//	}
		for(char x: str.toCharArray()) {
			if(x==c) {
				answer++;
			}
		}
		return answer;
	}

}
