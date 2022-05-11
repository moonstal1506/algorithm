package dfs_bfs2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//5. 동전교환
public class Ex5 {
	static int n, m, answer=Integer.MAX_VALUE;
	public void DFS(int L, int sum, Integer[] arr){
		if(L>=answer) return;
		if(sum>m) return;
		if(sum==m) {
			answer= Math.min(answer, L);
		}else {
			for(int i=0;i<n;i++) {
				DFS(L+1,sum+arr[i],arr);
			}
		}
	}
	public static void main(String[] args){
		Ex5 T = new Ex5();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		m=kb.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}