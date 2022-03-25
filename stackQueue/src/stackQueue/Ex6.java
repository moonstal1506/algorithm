package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//6. ���ֱ��ϱ�
//���� 2�� �Է¹޾ƳѰ� ���� ����
//�� �ʱ�ȭ
//ť ������ ��ũ�帮��Ʈ
//1���� n���� �ݺ��ؼ� ť�� �־���
//������� ���������� k�տ��� �ڷ� �־��ְ� ���Ž�Ŵ
//1�������� �װ� ��
public class Ex6 {
	private static int solution(int n,int k) {
		int answer = 0;
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<=n;i++) q.offer(i);
		while(!q.isEmpty()) {
			for(int i=1;i<k;i++) q.offer(q.poll());
			q.poll();
			if(q.size()==1) answer=q.poll();
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.print(solution(n,k));
		
	}

}
