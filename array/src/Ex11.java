import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


//11. �ӽù������ϱ�
//n�� �޾Ƽ� 1���� �����ϴ� 2�����迭 5���� ��
//1���ͽ����ϴ� �ݺ��� ���ڴ�Ƽ� �Ѱ�
//answer�� max����
//1���� ���߹ݺ� cnt���� 5�ݱ���
//���� ������ ++�ϰ� ����
//max���� ũ�� �ٲ� �¹�ȣ�� ��
//�� 1������ ����? �л���ȣ 1������ �л���ȣ ����
public class Ex11 {
	public static int solution(int n,int[][] arr) {
		int answer=0,max=0;
		for(int i=1;i<=n;i++) {
			int cnt=0;
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=5;k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(max<cnt) {
				max=cnt;
				answer=i;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(solution(n,arr));
		
	}

}
