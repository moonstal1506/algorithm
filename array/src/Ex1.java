
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//1. ū������ϱ�
//�����Է¹޾� �迭����
//�ݺ������� �� �迭�� ���
//�ַ�ǿ� �Ѱ�
//��̸���Ʈ ����� 0��° answer�� ���
//�񱳹ݺ� ũ�� ��� 

public class Ex1 {
	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		for(int x: solution(n,arr)) {
			System.out.print(x+" ");
		}
	}

}