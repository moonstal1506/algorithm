

import java.util.Arrays;

public class 부 {

	static int N=4;
	static boolean isVisited[]= new boolean[N];
	public static void main(String[] args) {
		sub(0);
		
//		for(int i=0;i<(1<<N);i++) {
//			for(int j=0;j<N;j++) {
//				if((i&1<<j)!=0) {
//					
//				}
//			}
//		}
	}
	private static void sub(int cnt) {
		if(cnt==N) {
			System.out.println(Arrays.toString(isVisited));
			return;
		}
		isVisited[cnt]=true;
		sub(cnt+1);
		
		isVisited[cnt]=false;
		sub(cnt+1);
	}
	
	
}
