package string;

import java.util.ArrayList;
import java.util.Scanner;

//12.
//answer �ʱ�ȭ
//�ݺ� n��
//����7���� �ڸ��� replace�� ����
//2������ ��ȯ
//char�� ����ȯ answer�� ���
//�տ�7�� �߶󳻱�
public class Ex12 {
	private static String solution(int n, String s) {
		String answer = "";
		for(int i=0;i<n;i++) {
			String tmp= s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp,2);
			answer+=(char)num;
			s=s.substring(7);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s= kb.next();
		System.out.print(solution(n,s));
	}

}
