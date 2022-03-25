package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8.���޽�
//��ȯ�ڼ�, m��° ȯ��, ���赵�迭 �Է� �޾� ���ڸ���
//�����ü ������� id�� ���赵 �ʿ�
//���� 0���� �ʱ�ȭ
//ť����� n������ �����ü ť�� �־���
//ť�� ������� ���� ������ ť���� ���� �ӽú����� ����
//ť���ִ� ������� �ӽú������� ���赵 ��
//�ӽú��� ���赵 ������ �ٽ� �ڷ� ������ �ӽú��� ���ʱ�ȭ�ϰ� ����
//�ӽú����� ���̾ƴϸ� ��++�ϰ� �ӽú������̵�� m�� ������ �丮��


class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id=id;
		this.priority=priority;
	}
}

public class Ex8 {
	
	private static int solution(int n, int m, int[] arr) {
		int answer=0;
		Queue<Person> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			q.offer(new Person(i,arr[i]));
		}
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x:q) {
				if(x.priority>tmp.priority) {
					q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) return answer;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(solution(n,m,arr));
		
	}

}
