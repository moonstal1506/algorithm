package hashMapTreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//5. K번째 큰 수
public class Ex5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		
		TreeSet<Integer> set= new TreeSet<>(Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int y=j+1;y<n;y++) {
					set.add(arr[i]+arr[j]+arr[y]);
				}
			}
		}
		int cnt=0;
		int answer=-1;
		for(int x:set) {
			cnt++;
			if(cnt==k) {
				answer=x;
				break;
			}
		}
		System.out.println(answer);
	}
}
