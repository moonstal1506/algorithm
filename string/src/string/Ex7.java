package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
	private static String solution(String str) {
//		String answer="YES";
//		str=str.toUpperCase();
//		for(int i =0 ; i<str.length()/2;i++) {
//			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
//				return "NO";
//			}
//		}
		String answer="NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(tmp.equalsIgnoreCase(str)) return "YES";
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));

	}

}
