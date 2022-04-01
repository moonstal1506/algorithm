
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//5.동전교환
public class Ex5 {
	static int n, m, answer=Integer.MAX_VALUE;
	public void DFS(int L, int sum, Integer[] arr){
		if(sum>m) return;//멈추기
		if(L>=answer) return;//멈추기
		if(sum==m){//거스름돈 충족
			answer=Math.min(answer, L);//최소 몇개
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
		n=kb.nextInt();//동전 종류개수
		Integer[] arr=new Integer[n];//정렬하려면 Integer 객체형 기본형 안됨
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());//큰 금액부터 정렬하면 더 빨리 찾을 수 있다.
		m=kb.nextInt();//거스름돈
		T.DFS(0, 0, arr);//동전 개수,합, 동전종류담은 배열
		System.out.println(answer);
	}
}