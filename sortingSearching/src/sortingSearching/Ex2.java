package sortingSearching;

import java.util.Scanner;

//2.��������
//���߹ݺ�
//�յں��ؼ� �ڿ��� ������ ������ �ٲ���
//�ѹ� �������� ���� ū���� ������-> �ݺ����� n-iŭ�� ���ƾ���
public class Ex2 {
	private static int[] solution(int n, int[] arr) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp =arr[j];
					arr[j] =arr[j+1];
					arr[j+1] =tmp;
				}

			}
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