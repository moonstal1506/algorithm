package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//2. 괄호문자제거
public class Ex2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		Stack<Character> stack= new Stack<>();
		String answer="";
		for(char x:str.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(') ;
			}else {
				stack.push(x);
			}
		}
		for(int i=0;i<stack.size();i++) {
			answer+=stack.get(i);
		}
		System.out.println(answer);
	}

}
