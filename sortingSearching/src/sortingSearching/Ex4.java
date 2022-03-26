package sortingSearching;

import java.util.Scanner;

//4.Least Recently Used
//ũ��� ���� �迭 �Է� �޾� �迭 ���
//ĳ�� �迭����� �Է¹��� �迭���� �ε��� -1���ʱ�ȭ
//�����ŭ �ݺ� ĳ�ÿ� �̹� �����ϸ� �ε����� ĳ���ڸ��� ����
//-1�̸� ĳ�ÿ� �����ٴ� �� �ڿ�������  �տ��� �ڷ� �����ش�
//ĳ�ÿ� �־��ٸ� ĳ�ð� �ִ� �ڸ����� ����
//0��° �ڸ��� �װ� �;��Ѵ�.
public class Ex4 {
	private static int[] solution(int s, int n, int[] arr) {
		int[] cache = new int[s];
		for(int x: arr) {
			int pos=-1;
			for(int i=0;i<s;i++) if(x==cache[i]) pos=i; 
			if(pos==-1) {
				for(int i=s-1;i>=1;i--) {
					cache[i]=cache[i-1];
				}
			}
			else {
				for(int i=pos;i>=1;i--) {
					cache[i]=cache[i-1];
				}
			}
			cache[0]=x;
		}
		return cache;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		for(int x:solution(s,n,arr)) {
			System.out.print(x+" ");
			
		}
		
	}

}