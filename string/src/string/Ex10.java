package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
	private static int[] solution(String str, char t) {

		int[] answer = new int[str.length()];
		int p = 1000;
		for (int i = 0; i < str.length(); i++) {
			if (t == str.charAt(i)) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}

		p = 1000;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (t == str.charAt(i)) {
				p = 0;
			} else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		for (int x : solution(str, c)) {
			System.out.print(x + " ");
		}

	}

}
