package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
	private static String solution(String str) {

		String answer="NO";
		str= str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(tmp.equalsIgnoreCase(str)) return "YES";
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(solution(str));

	}

}
