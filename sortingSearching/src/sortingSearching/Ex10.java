package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//10. 마구간 정하기(결정알고리즘)

public class Ex10 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=kb.nextInt();
		
		Arrays.sort(arr);
		int lt=1;
		int rt=arr[arr.length-1];
		int answer=0;
		while(lt<=rt) {
			int mid= (lt+rt)/2;
			if(count(arr,mid)>=m) {
				answer=mid;
				lt=mid+1;
			}else {
				rt=mid-1;
			}
		}
		System.out.println(answer);
	}

	private static int count(int[] arr, int mid) {
		int start=arr[0];
		int cnt =1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-start>=mid) {
				cnt++;
				start=arr[i];
			}
		}
		return cnt;
	}

}