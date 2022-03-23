package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//2. �������
//��̸���Ʈ�� ��������
//�Ѱܹ��� �迭 ����
//������ ����� �ϳ� ���������� 
//������ ��� ������2���� ����
//�ƴϸ� �������� ������ ����

public class Ex2 {
	private static ArrayList<Integer> solution(int n,int m, int[] a,int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0,p2=0;
		while(p1<n&&p2<m) {
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;	
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b= new int[m];
		for(int i=0;i<m;i++) {
			b[i]=kb.nextInt();
		}
		for(int x:solution(n,m,a,b))
			System.out.print(x+" ");
		
	}

}