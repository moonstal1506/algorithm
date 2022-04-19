package twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//1. 두 배열 합치기 O
public class Ex1 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
//		int[] a= new int[n];
//		ArrayList<Integer> arr=new ArrayList<>();
//		for(int i=0;i<n;i++) {
//			arr.add(kb.nextInt());
//		}
//		int m = kb.nextInt();
//		for(int i=0;i<m;i++) {
//			arr.add(kb.nextInt());
//		}
//		Collections.sort(arr);
		
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
		
		ArrayList<Integer> arr=new ArrayList<>();
		int pa=0;
		int pb=0;
		while(pa<n&&pb<m) {
			if(a[pa]<b[pb]) arr.add(a[pa++]);
			else arr.add(b[pb++]);
		}
		while(pa<n) arr.add(a[pa++]);
		while(pb<m) arr.add(b[pb++]);
		
		for(int i:arr)
		System.out.print(i+" ");
		
	}

}