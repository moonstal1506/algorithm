package twoPointersSlidingWindow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//2. 공통원소 구하기

public class Ex2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b= new int[m];
		for(int i=0;i<m;i++) {
			b[i]=kb.nextInt();
		}
		int n2=0;
		int m2=0;
		
		ArrayList<Integer> arr=new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		while(n2<n&&m2<m) {
			if(a[n2]==b[m2]) {
				arr.add(a[n2]);
				n2++;
				m2++;
			}else if(a[n2]<b[m2]) {
				n2++;
			}else {
				m2++;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}