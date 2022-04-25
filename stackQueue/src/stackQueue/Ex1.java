package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//1. 올바른 괄호
public class Ex1 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		Stack<Character> st= new Stack<>();
		String answer="YES";
		for(char ch: str.toCharArray()) {
			if(ch=='(') {
				st.push(ch);
			}else {
				if(st.isEmpty()) {
					answer="NO";
					break;
				}
				st.pop();
			}
		}
		if(!st.isEmpty()) {
			answer="NO";
		}
		System.out.println(answer);
	}
}
