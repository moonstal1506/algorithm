package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

//9. 뮤직비디오(결정알고리즘)
public class Ex9 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();

		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		int mid=0;
		int answer=0;
		while(lt<=rt){
			mid= (lt+rt)/2;
			if(count(arr,mid)<=m) {
				answer=mid;
				rt=mid-1;
			}else {
				lt=mid+1;
			}
		}
		System.out.println(answer);
	}

	private static int count(int[] arr, int mid) {
		int cnt=1;
		int sum=0;
		for(int x: arr) {
			if(sum+x>mid) {
				cnt++;
				sum=x;
			}else {
				sum+=x;
			}
		}
		return cnt;
	}

}