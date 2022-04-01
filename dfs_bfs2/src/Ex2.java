
import java.util.Scanner;

//2. 바둑이 승차
//부분집합의 합
public class Ex2 {
	static int answer=Integer.MIN_VALUE, c, n;
	public void DFS(int L, int sum, int[] arr){
		if(sum>c) return;//합이 최대 무게보다 크면 리턴
		if(L==n){//5마리가 되었을 때
			answer=Math.max(answer, sum);//부분집합이 만들어질 때마다 비교
		}
		else{
			DFS(L+1, sum+arr[L], arr);//추가한다
			DFS(L+1, sum, arr);//추가하지 않는다
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