package stackQueue;

import java.util.Scanner;
import java.util.Stack;

//4. �����Ŀ���
//���ڿ��Է� ���ڸ���
//��0 �ʱ�ȭ
//���ø���� ���ڿ�����
//���ڰ����ڸ� ���ÿ� ��µ� -'0' ���ڷ� �ٲ㼭�ֱ�
//�ƴϸ� ��ȣ�ΰǵ� ���� rt �״���lt�� �̾�
//�θ𸶴� ����ؼ� ���ÿ� ��´�
//���� ���ÿ� ���� �����.
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
