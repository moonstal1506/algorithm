package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//5-1.���ӵ� �ڿ����� ��
//�չ����� ���������� �Է¹��� ���ڷ� �迭�� �������Ѵ�.
//�ִ밡 n/2+1�̴�
//�迭 ����
//rt�� m�� ���� sum
//n�� ������ ++
//sum�� ũ�ų� ������ 
//lt���� ������ ������ Ȯ�� �ݺ�

//5-2.
//15�� 2�� ���ӵ� �� ������� 1,2/3�� �� 1,2,3 ���ؼ� ���ص� cnt���� ���� ������ �� �������� 0�̸� ����


public class Ex5 {
	private static int solution(int n) {
//		int answer=0,sum=0,lt=0;
//		int m =n/2+1;
//		int[] a=new int[m];
//		for(int i=0; i<m;i++) {
//			a[i]=i+1;
//		}
//		for(int rt=0;rt<m;rt++) {
//			sum+=a[rt];
//			if(sum==n) answer++;
//			while(sum>=n) {
//				sum-=a[lt++];
//				if(sum==n) answer++;
//			}
//		}
		
		int answer=0, cnt=1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0)answer++;
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(solution(n));
		
	}

}