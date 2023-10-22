

import java.util.Arrays;

public class 조 {

	static int N=4;
	static int M=3;
	static int[] arr=new int[M];
	
	public static void main(String[] args) {
		combi(0,0);
	}

	private static void combi(int cnt, int start) {
		if(cnt==3) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=start;i<N;i++) {
			arr[cnt]=i;
			combi(cnt+1, i+1);
		}
	}
}
