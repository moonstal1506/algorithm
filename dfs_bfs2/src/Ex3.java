
import java.util.Scanner;

//3. 최대점수 구하기
//앞문제에서 제한시간만 추가해서 하면 됨
public class Ex3 {
	static int answer=Integer.MIN_VALUE, n, m;
	boolean flag=false;
	public void DFS(int L, int sum, int time, int[] ps, int[] pt){
		if(time>m) return;
		if(L==n){
			answer=Math.max(answer, sum);
		}
		else{
			DFS(L+1, sum+ps[L], time+pt[L], ps, pt);//문제를 푼다
			DFS(L+1, sum, time, ps, pt);//풀지 않는다
		}
	}

	public static void main(String[] args){
		Ex3 T = new Ex3();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//문제개수
		m=kb.nextInt();//제한시간
		int[] a=new int[n];//점수
		int[] b=new int[n];//제한시간
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
			b[i]=kb.nextInt();
		}
		T.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}
}