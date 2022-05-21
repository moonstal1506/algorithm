package dynamic;

import java.util.Arrays;
import java.util.Scanner;


//5. 동전교환(냅색 알고리즘)
public class Ex4 {

	public static void main(String[] args){
		Ex4 T = new Ex4();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		int m=kb.nextInt();
		int[] dy=new int[m+1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0]=0;
		for(int i=0; i<n; i++){
			for(int j=arr[i]; j<=m; j++){
				dy[j]=Math.min(dy[j], dy[j-arr[i]]+1);
			}
		}
		System.out.print(dy[m]);
	}
}