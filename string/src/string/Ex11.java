
package string;

import java.util.ArrayList;
import java.util.Scanner;

//11. ���ڿ�����
//answer ���ڿ� �ʱ�ȭ
//���ڿ� �ڿ� �����߰�
//cnt 1�� �ʱ�ȭ
//�ݺ� ����-1����
//�ڿ� ���ڰ� ������ cnt����
//�ٸ��� answer�� �����߰�
//cnt�� 1���� ũ�� answer�� cnt�߰�
//cnt1�� �ʱ�ȭ
public class Ex11 {
	private static String solution(String s) {

		String answer = "";
		 s=s+" ";
		 int cnt =1;
		 for(int i=0;i<s.length()-1;i++) {
			 if(s.charAt(i)==s.charAt(i+1)) cnt++;
			 else {
				 answer+=s.charAt(i);
				 if(cnt>1) answer+=String.valueOf(cnt);
				 cnt=1;
			 }
		 }
		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.print(solution(s));
	}

}
