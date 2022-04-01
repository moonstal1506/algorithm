
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//5.������ȯ
public class Ex5 {
	static int n, m, answer=Integer.MAX_VALUE;
	public void DFS(int L, int sum, Integer[] arr){
		if(sum>m) return;//���߱�
		if(L>=answer) return;//���߱�
		if(sum==m){//�Ž����� ����
			answer=Math.min(answer, L);//�ּ� �
		}
		else{
			for(int i=0; i<n; i++){
				DFS(L+1, sum+arr[i], arr);
			}
		}	
	}
	public static void main(String[] args){
		Ex5 T = new Ex5();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//���� ��������
		Integer[] arr=new Integer[n];//�����Ϸ��� Integer ��ü�� �⺻�� �ȵ�
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());//ū �ݾ׺��� �����ϸ� �� ���� ã�� �� �ִ�.
		m=kb.nextInt();//�Ž�����
		T.DFS(0, 0, arr);//���� ����,��, ������������ �迭
		System.out.println(answer);
	}
}