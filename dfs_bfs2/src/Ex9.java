
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//9.조합 구하기
//순서가 상관이 없다
public class Ex9 {
	static int[] combi;
	static int n, m; //n개중 m개를 뽑아라
	public void DFS(int L, int s){
		if(L==m){//2개다 만들어지면
			for(int x : combi) System.out.print(x+" ");
			System.out.println();
		}
		else{
			for(int i=s; i<=n; i++){//1부터 n가닥
				combi[L]=i;
				DFS(L+1, i+1);//i+1은 반복문i로 들어가는데 조합은 또 뽑을 필요 없으니까 앞에서 한건 안해도 돼
			}
		}
	}
	public static void main(String[] args){
		Ex9 T = new Ex9();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		combi=new int[m];
		T.DFS(0, 1);//0개 숫자 1뽑을 것
	}
}