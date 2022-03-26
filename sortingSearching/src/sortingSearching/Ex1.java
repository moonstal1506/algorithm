package sortingSearching;

import java.util.Scanner;
//1. ��������
//���� ���� �Է� �޾� �迭 ���� �� �Է� �迭 ����
//�������� �ε����� i�� �ʱ�ȭ�ϰ� ���� �ݺ����� �� �ں��� ����
//�ε������� ������ �ε����� �ٲ��ش�
//i�ڸ��� �ε����ڸ��� �ٲ۴�.
public class Ex1 {
	private static int[] solution(int n, int[] arr) {
		for(int i=0;i<n;i++) {
			int idx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[idx]) idx=j;//���� ������ ã��
			}
			int tmp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=tmp;
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