
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//4.�Ǻ���ġ ���
//2���� �տ� �Ͱ� �ٷ� ���� ���� ���� ���
//Ʈ�� �׷����� �� �� ����
public class Ex4 {
//	public int DFS(int n){
//		if(n==1) return 1;
//		else if(n==2) return 1;
//		else return DFS(n-2)+DFS(n-1);
//	}
//	public static void main(String[] args){
//		Ex4 T = new Ex4();
//		int n=10;
//		for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
//	}	
	
	
//	�迭�� ���ϵΰ� ���س����� ��Ȱ���ϱ�
//	��ͼ��� ������ ���ÿ� ���̱� ����
	static int[] fibo;
	public int DFS(int n){
		if(fibo[n]>0) return fibo[n];//0���� ũ�ٴ°� �̹� ���س��ٴ� ��
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else return fibo[n]=DFS(n-2)+DFS(n-1);
	}
	public static void main(String[] args){
		Ex4 T = new Ex4();
		int n=45;
		fibo=new int[n+1];//1���� ����ҰŶ�
		T.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
	}	
	
}