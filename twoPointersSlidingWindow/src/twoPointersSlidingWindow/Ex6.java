package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//6. �ִ� ���� ���Ӻκм���
//n������ k�� �ٲܼ� �ִ� �Է¹ް�
//n�� �迭 ���� �����Է¹ޱ�
//answer cnt lt �ʿ�
//�ݺ� rt n�� 
//0�̸� cnt++
//�ٲܼ� �ִ� Ƚ�� �ʰ� k�������� lt�����ϰǵ� 0�̸� cnt--���ְ� lt++
//���� �ִ밪 ���̰��rt-lt+1
public class Ex6 {
	private static int solution(int n,int k,int[] arr) {
		int answer=0,cnt=0,lt=0;
		for(int rt=0;rt<n;rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>k) {
				if(arr[lt]==0)cnt--;
				lt++;
			}
			answer=Math.max(answer, rt-lt+1);
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(solution(n,k,arr));
		
	}

}