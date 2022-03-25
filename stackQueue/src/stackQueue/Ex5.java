package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//5. �踷���
//���ڿ��Է¹޾� ���ڸ���
//�� 0�ʱ�ȭ
//���ø����
//���ڱ��̸�ŭ ����
//(�� ���ÿ� ���
//)�� ���� 
//�ٷξ� (�� ����ũ�⸸ŭ ����
//�ƴϸ� �Ǵٸ��ϳ� ++
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
