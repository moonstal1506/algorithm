package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//5. 중복 확인
public class Ex5 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= kb.nextInt();
		}
		Arrays.sort(arr);
		char answer= 'U';
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				answer='D';
				break;
			}
		}
		System.out.println(answer);
	}
}