package sortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//6. �峭�ٷ���
//���� ��̸���Ʈ�� ���
//�ӽù迭�� ������ ���� ���ؼ� �ٸ� ��ȣ �ֱ�
public class Ex6 {
	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer=new ArrayList<>();
		int[] tmp= arr.clone();
		Arrays.sort(tmp);
		for(int i=0;i<n;i++) {
			if(arr[i]!=tmp[i]) answer.add(i+1);
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		for(int x:solution(n,arr))
		System.out.print(x+" ");
	}

}