
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//1.���� ���� �κ�����
public class Ex1 {
	static String answer="NO";
	static int n, total=0;
	boolean flag=false;
	public void DFS(int L, int sum, int[] arr){
		if(flag) return;
		if(sum>total/2) return;//sum���� Ŀ���� �� �� �ʿ� ���� 
		if(L==n){//���Ұ����� �Ǿ��� ��
			if((total-sum)==sum) {//������ ���̸�
				answer="YES";//����
				flag=true;
			}	
		}
		else{
			DFS(L+1, sum+arr[L], arr);//���տ� �ִ´� �迭�� ��
			DFS(L+1, sum, arr);//���� �ʴ´�
		}
	}
	public static void main(String[] args){
		Ex1 T = new Ex1();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//���Ұ���
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
			total+=arr[i];
		}
		T.DFS(0, 0, arr);//���Ұ��� 0, �� 0
		System.out.println(answer);
	}
}