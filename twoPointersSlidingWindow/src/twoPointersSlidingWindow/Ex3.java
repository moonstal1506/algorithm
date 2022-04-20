package twoPointersSlidingWindow;

import java.util.Scanner;

//3. 최대 매출
public class Ex3 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		int sum=0;
		int answer=0;
		for(int i=0;i<k;i++) {
			sum+=a[i];
		}
		answer=sum;
		for(int i=k;i<n;i++) {
			sum+=a[i]-a[i-k];
			answer=Math.max(answer, sum);
		}
		System.out.println(answer);
	}
}