
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//9.���� ���ϱ�
//������ ����� ����
public class Ex9 {
	static int[] combi;
	static int n, m; //n���� m���� �̾ƶ�
	public void DFS(int L, int s){
		if(L==m){//2���� ���������
			for(int x : combi) System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=s; i<=n; i++){//1���� n����
				combi[L]=i;
				DFS(L+1, i+1);//i+1�� �ݺ���i�� ���µ� ������ �� ���� �ʿ� �����ϱ� �տ��� �Ѱ� ���ص� ��
			}
		}
	}
	public static void main(String[] args){
		Ex9 T = new Ex9();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		combi=new int[m];
		T.DFS(0, 1);//0�� ���� 1���� ��
	}
}