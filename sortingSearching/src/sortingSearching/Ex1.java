package sortingSearching;

import java.util.Scanner;
//1. 선택 정렬
public class Ex1 {
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}

		for(int i=0;i<n;i++) {
			int idx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[idx]>arr[j]) {
					idx=j;
				}
			}
			int tmp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=tmp;
		}
		for(int x: arr) {
			System.out.print(x+" ");
		}
	}
}