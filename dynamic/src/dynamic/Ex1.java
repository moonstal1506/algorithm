package dynamic;

import java.util.Scanner;


//1. 계단오르기
public class Ex1 {

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		//배열  1,2 초기화 3부터 n까지는 앞 2개 더하기
		int[] dy=new int[n+1];
		dy[1]=1;
		dy[2]=2;
		for(int i=3; i<=n; i++) {
			dy[i]=dy[i-2]+dy[i-1];
		}
		System.out.print(dy[n]);
	}
}