package string;

import java.util.Scanner;
//2.대소문자 변환 o
public class Ex2 {
	public static String solution(String str) {
		String a="";
		for(char c:str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				a+=Character.toLowerCase(c);
			}else {
				a+=Character.toUpperCase(c);
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
