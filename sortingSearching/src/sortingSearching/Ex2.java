package sortingSearching;

import java.util.Scanner;

//2. 버블 정렬
public class Ex2 {
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		for(int j=0;j<n-1;j++) {
			for(int i=1;i<n-j;i++) {
				if(arr[i-1]>arr[i]) {
					int tmp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=tmp;
				}
			}
		}
		for(int x:arr) {
			System.out.print(x+" ");
			
		}
	}
}