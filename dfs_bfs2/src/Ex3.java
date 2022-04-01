
import java.util.Scanner;

//3. �ִ����� ���ϱ�
//�չ������� ���ѽð��� �߰��ؼ� �ϸ� ��
public class Ex3 {
	static int answer=Integer.MIN_VALUE, n, m;
	boolean flag=false;
	public void DFS(int L, int sum, int time, int[] ps, int[] pt){
		if(time>m) return;
		if(L==n){
			answer=Math.max(answer, sum);
		}
		else{
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt);//������ Ǭ��
			DFS(L+1, sum, time, ps, pt);//Ǯ�� �ʴ´�
		}
	}

	public static void main(String[] args){
		Ex3 T = new Ex3();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//��������
		m=kb.nextInt();//���ѽð�
		int[] a=new int[n];//����
		int[] b=new int[n];//���ѽð�
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
			b[i]=kb.nextInt();
		}
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}
}