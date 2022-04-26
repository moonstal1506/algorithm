package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//5. 쇠막대기
public class Ex5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		Stack<Character> stack= new Stack<>();
		int answer=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				stack.push('(');
			}else {
				stack.pop();
				if(str.charAt(i-1)=='(') {
					answer+=stack.size();
				}else {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}

}
