
import java.util.Scanner;

//4. 중복순열
public class Ex4 {
	static int[] pm;
	static int n, m;
	public void DFS(int L){
		if(L==m){//다뽑았을 때 2가 되면
			for(int x : pm) System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=1; i<=n; i++){//중복이니까 n번
				pm[L]=i;//L에는 0,1까지 2가되면 리턴되니까 여기까지 안온다 i는 123
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