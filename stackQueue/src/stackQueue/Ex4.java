package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//4. 후위식연산
//문자열입력 숫자리턴
//답0 초기화
//스택만들어 문자열돌려
//문자가숫자면 스택에 담는데 -'0' 숫자로 바꿔서넣기
//아니면 부호인건데 맨위 rt 그다음lt로 뽑아
//부모마다 계산해서 스택에 담는다
//답은 스택에 남은 결과다.
public class Ex4 {
	private static int solution(String str) {
		int answer = 0;
		Stack<Integer> stack=new Stack<>();
		for(char x: str.toCharArray()) {
			if(Character.isDigit(x)) stack.push(x-'0');
			else {
				int rt=stack.pop();
				int lt=stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		answer=stack.get(0);
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(solution(str));
		
	}

}
