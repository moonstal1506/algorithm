package dynamic;

import java.util.Arrays;
import java.util.Scanner;


//5.������ȯ ����  
public class Ex4 {
	static int n, m;//�������� ,�Ž�����
	static int[] dy;
	public int solution(int[] coin){
		Arrays.fill(dy, Integer.MAX_VALUE);//�ּ� ���� ���� �Ŵϱ� �ִ밪���� �ʱ�ȭ
		dy[0]=0;
		for(int i=0; i<n; i++){
			for(int j=coin[i]; j<=m; j++){//���� ������ ���� 1�� � �ʿ� �����ϰ� 3�� �� �ִ��� 5�� �� �ִ���
				dy[j]=Math.min(dy[j], dy[j-coin[i]]+1);//���������� ������ �ٲ��ٰǵ� �Ž������� �������� �� ������ ����������+1
			}
		}
		return dy[m];//�ʿ��� �Ž������� �ּ� ��������
	}

	public static void main(String[] args){
		Ex4 T = new Ex4();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){//���� ���� ���
			arr[i]=kb.nextInt();
		}
		m=kb.nextInt();
		dy=new int[m+1];
		System.out.print(T.solution(arr));
	}
}