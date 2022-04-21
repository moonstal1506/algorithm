package twoPointersSlidingWindow;

import java.util.Scanner;

//4. 연속 부분수열
public class Ex4 {
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		int count = 0;
		int lt=0;
		int sum=0;
		for(int rt=0;rt<n;rt++) {
			sum+=a[rt];
			if(sum==m) {
				count++;
			}
			while(sum>=m) {
				sum-=a[lt++];
				if(sum==m) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}