package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//7. ������������
//�ʼ�����,��ȹ �Է¹޾� yes/no����
//���� ������ �ʱ�ȭ
//ť����
//ť�� �ʼ����� ���
//��ȹ�� �ݺ��� �����鼭 ť�� ���ԵǾ������� ť������ ��ȹ�� �� �ٸ��� �� ����
//�ݺ��� ť�� ������� ������ �� ����
public class Ex7 {
	private static String solution(String need,String plan) {
		String answer = "YES";
		Queue<Character> q=new LinkedList<>();
		for(char x: need.toCharArray()) q.offer(x);
		for(char x: plan.toCharArray()) {
			if(q.contains(x)) {
				if(q.poll()!=x) return "NO";
			}
		}
		if(!q.isEmpty()) return "NO";
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String need = kb.next();
		String plan = kb.next();
		System.out.print(solution(need,plan));
		
	}

}
