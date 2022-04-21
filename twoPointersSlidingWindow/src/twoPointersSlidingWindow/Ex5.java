package twoPointersSlidingWindow;

import java.util.Scanner;

//5.연속된 자연수의 합 O
public class Ex5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i]=i;
		}
		int sum=0;
		int cnt=0;
		int lt=1;
		int m=n/2+1;
		for(int rt=1;rt<=m;rt++) {
			sum+=arr[rt];
			if(sum==n) {
				cnt++;
			}
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}