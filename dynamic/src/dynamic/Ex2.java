package dynamic;

import java.util.Scanner;


//2. 돌다리 건너기
public class Ex2 {

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] dy=new int[n+2];
		dy[1]=1;
		dy[2]=2;
		//한번 더 가야함
		for(int i=3; i<=n+1; i++) {
			dy[i]=dy[i-2]+dy[i-1];
		}
		System.out.print(dy[n+1]);
	}
}