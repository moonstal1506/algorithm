package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//4.���� �κм���
//answer, sum lt�ʱ�ȭ
//rt�� n���� ����
//sum�� ���� m�� ������ ��++
//sum�� m���� ũ�ų� ������ lt�ű�鼭 ���� �ݺ� 
//�������� ��++
public class Ex4 {
	private static int solution(int n,int m, int[] a) {
		int answer=0,sum=0,lt=0;
		for(int rt=0; rt<n;rt++) {
			sum+=a[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=a[lt++];
				if(sum==m) answer++;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		System.out.print(solution(n,m,a));
		
	}

}