
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//1.합이 같은 부분집합
public class Ex1 {
	static String answer="NO";
	static int n, total=0;
	boolean flag=false;
	public void DFS(int L, int sum, int[] arr){
		if(flag) return;
		if(sum>total/2) return;//sum보다 커지면 더 할 필요 없음 
		if(L==n){//원소개수가 되었을 때
			if((total-sum)==sum) {//총합이 반이면
				answer="YES";//예스
				flag=true;
			}	
		}
		else{
			DFS(L+1, sum+arr[L], arr);//집합에 넣는다 배열의 값
			DFS(L+1, sum, arr);//넣지 않는다
		}
	}
	public static void main(String[] args){
		Ex1 T = new Ex1();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();//원소개수
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
			total+=arr[i];
		}
		T.DFS(0, 0, arr);//원소개수 0, 합 0
		System.out.println(answer);
	}
}