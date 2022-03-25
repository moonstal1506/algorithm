package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//5. 쇠막대기
//문자열입력받아 숫자리턴
//답 0초기화
//스택만들어
//문자길이만큼 돌려
//(면 스택에 담아
//)면 빼고 
//바로앞 (면 스택크기만큼 더해
//아니면 꽁다리하나 ++
public class Ex5 {
	private static int solution(String str) {
		int answer = 0;
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1)=='(') answer+=stack.size();
				else answer++;
			}
			
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(solution(str));
		
	}

}
