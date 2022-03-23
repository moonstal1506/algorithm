package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;

//1.�ι迭��ġ��
//�����Է� �迭����� ��� �ι�����
//nmab�ѱ�
//��̸���Ʈ
//������ �ΰ� �����
//�ϳ��� ���������� �ݺ� ���ؼ� ������ �ְ� �������� ������ �Ű��ֱ�
//�������� ���������� �ֱ� �� ����
public class Ex1 {
	private static ArrayList<Integer> solution(int n,int m, int[] a,int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0,p2=0;
		while(p1<n&&p2<m) {
			if(a[p1]<b[p2]) {
				answer.add(a[p1++]);
			}else {
				answer.add(b[p2++]);
			}
		}
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		
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