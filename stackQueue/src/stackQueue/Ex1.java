package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//1.올바른괄호
//문자열입력받아
//yes로 초기화
//스택생성
//문자열돌려
//(면 푸시 )인데비어있으면 노
//아니면 팝
//(가남아있는경우는 노
//답리턴
public class Ex1 {
	private static String solution(String str) {
		String answer = "YES";
		Stack<Character> stack=new Stack<>();
		for(char x:str.toCharArray()) {
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(solution(str));
		
	}

}
