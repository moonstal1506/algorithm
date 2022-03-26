package sortingSearching;

import java.util.Scanner;

//3.�������� �ڿ��� ������ ���鼭 ��
//1 ���ͽ��� �ӽú����� i�ڸ� j�� �ۿ��� ����
//i�� �տ��� 0���� �۰ų� ���������� �پ��鼭 �ݺ�
//�ӽú�������ũ�� �ڿ� �־��� �ƴϸ� �ݺ��� ����
//��������+1�Ѱ��� �ӽú��� ����

public class Ex3 {
	private static int[] solution(int n, int[] arr) {
		for(int i=1;i<n;i++) {
			int tmp=arr[i],j;
			for(j=i-1;j>=0;j--) {
				if(arr[j]>tmp) arr[j+1]=arr[j];
				else break;
			}
			arr[j+1]=tmp;
		}
		return arr;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		for(int x:solution(n,arr)) {
			System.out.print(x+" ");
			
		}
		
	}

}