import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//5. �Ҽ�
//n�Ѱ�
//cnt�� 0
//�迭����
//2���� ���� 
//�ʱ⿡�� �� 0�̹Ƿ� 0�̸�++
//�ݺ����� ���ã�� 1����
public class Ex5 {
	public static int solution(int n) {
		int cnt=0;
		int[] a=new int[n+1];
		for(int i=2; i<n;i++) {
			if(a[i]==0) {
				cnt++;
				for(int j=i;j<n;j+=i) a[j]=1;
			}
			
		}
		return cnt;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(solution(n));
		
	}

}
