package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//1.�ùٸ���ȣ
//���ڿ��Է¹޾�
//yes�� �ʱ�ȭ
//���û���
//���ڿ�����
//(�� Ǫ�� )�ε���������� ��
//�ƴϸ� ��
//(�������ִ°��� ��
//�丮��
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
