
import java.util.Scanner;

//4. �ߺ�����
public class Ex4 {
	static int[] pm;
	static int n, m;
	public void DFS(int L){
		if(L==m){//�ٻ̾��� �� 2�� �Ǹ�
			for(int x : pm) System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=1; i<=n; i++){//�ߺ��̴ϱ� n��
				pm[L]=i;//L���� 0,1���� 2���Ǹ� ���ϵǴϱ� ������� �ȿ´� i�� 123
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args){
		Ex4 T = new Ex4();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		pm=new int[m];
		T.DFS(0);
	}
}