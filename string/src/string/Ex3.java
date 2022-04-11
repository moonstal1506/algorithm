package string;

import java.util.Scanner;
//3. 문장속 단어 o
public class Ex3 {
	public static String solution(String str) {
		int leng=0;
		String answer="";
		String[] arr=str.split(" ");
		for(String a: arr) {
			if(a.length()>leng) {
				leng=a.length();
				answer=a;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}
}
