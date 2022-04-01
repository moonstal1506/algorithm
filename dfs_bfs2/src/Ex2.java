
import java.util.Scanner;

//2. �ٵ��� ����
//�κ������� ��
public class Ex2 {
	static int answer=Integer.MIN_VALUE, c, n;
	public void DFS(int L, int sum, int[] arr){
		if(sum>c) return;//���� �ִ� ���Ժ��� ũ�� ����
		if(L==n){//5������ �Ǿ��� ��
			answer=Math.max(answer, sum);//�κ������� ������� ������ ��
		}
		else{
			DFS(L+1, sum+arr[L], arr);//�߰��Ѵ�
			DFS(L+1, sum, arr);//�߰����� �ʴ´�
		}	
	}

	public static void main(String[] args){
		Ex2 T = new Ex2();
		Scanner kb = new Scanner(System.in);
		c=kb.nextInt();
		n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}