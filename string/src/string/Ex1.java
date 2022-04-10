package string;

import java.util.Scanner;
//1.문자찾긴
//문자열, 문자받고
//char로변경
//둘다 대문자로
//돌면서 비교
public class Ex1 {
	public static int solution(String str, char ch) {
		int count = 0;
		str = str.toUpperCase();
		ch = Character.toUpperCase(ch);
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == ch) {
//				count++;
//			}
//		}
		for(char c:str.toCharArray()) {
			if (c == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = sc.next().charAt(0);
		System.out.println(solution(str, ch));
	}
}
