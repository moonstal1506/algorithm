
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//1. 합이 같은 부분집합
//L이 n까지 갔을 때 합이 반과 같으면 yes
//flag true로 다 리턴 시켜+ sum이 커도 리턴
//아니라면 더한다 더하지 않는다
public class Ex1 {
	static String answer="NO";
	static int n, total=0;
	boolean flag=false;
	public void DFS(int L, int sum ,int[] arr){
		if(flag) return;
		if(sum>total/2) return;
		if(L==n) {
			if(total-sum==sum) {
				answer="YES";
				flag=true;
			}
		}else {
			DFS(L+1,sum+arr[L],arr);
			DFS(L+1,sum,arr);
		}
	}
	public static void main(String[] args){
		Ex1 T = new Ex1();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
			total+=arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}