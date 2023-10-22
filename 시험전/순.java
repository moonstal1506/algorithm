

import java.util.Arrays;

public class 순 {

	static int N=3;
	static int[] arr = new int[N];
	static boolean[] isVisited = new boolean[N];
	
	public static void main(String[] args) {
		permu(0);
	}

	private static void permu(int cnt) {
		if(cnt==N) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=0;i<N;i++) {
			if(isVisited[i]) {
				continue;
			}
			isVisited[i]=true;
			arr[cnt]=i;
			permu(cnt+1);
			isVisited[i]=false;
		}
	}
}
