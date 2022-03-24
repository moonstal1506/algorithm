package hashMapTreeSet;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;

//Ʈ����: �ߺ����� ����
//5. k��° ū ��
//n,k,�迭 �Է¹޾�
//answer-1�ʱ�ȭ
//Ʈ���¸���� ������������
//3��for Ʈ���¿� ���ؼ��־�
//����ʿ�cnt
//���ĵ� Ʈ���¿��� ���� cnt++ k�� �������� ����
//�ƴϸ� -1�� ����
public class Ex5 {
	private static int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());//��������
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int l=j+1;l<n;l++) {
					set.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
	
//		System.out.println(set.size());
//		System.out.println(set.first());
//		System.out.println(set.last());
		
		int cnt=0;
		
		for(int x:set) {
			cnt++;
			if(cnt==k) return x;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}

		System.out.print(solution(n,k,arr));

	}

}
