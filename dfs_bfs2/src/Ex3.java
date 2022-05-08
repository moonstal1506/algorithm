
import java.util.Scanner;

//3. 최대점수 구하기(DFS)
public class Ex3 {
	static int answer=Integer.MIN_VALUE, n, m;
	static int[] a;
	static int[] b;
	private void DFS(int L, int sum, int time) {
		if(time>m) {
			return;
		}
		if(L==n) {
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1,sum+a[L],time+b[L]);
			DFS(L+1,sum,time);
		}
	}

	public static void main(String[] args){
		Ex3 T = new Ex3();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		a=new int[n];
		b=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
			b[i]=kb.nextInt();
		}
		T.DFS(0, 0, 0);
		System.out.println(answer);
	}
}