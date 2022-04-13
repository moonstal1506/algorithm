package string;

import java.util.Scanner;

//6. 중복문자제거
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		System.out.println(answer);
	}
}
