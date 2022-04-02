package dynamic;

import java.util.Scanner;


//1.계단오르기
//동적계획법 문제를 가장 작게 만들어 확장된 문제에 씀
public class Ex1 {
	static int[] dy;
	public int solution(int n){
		dy[1]=1;
		dy[2]=2;
		for(int i=3; i<=n; i++) dy[i]=dy[i-2]+dy[i-1];//피보나치
		return dy[n];
	}

	public static void main(String[] args){
		Ex1 T = new Ex1();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		dy=new int[n+1];
		System.out.print(T.solution(n));
	}
}