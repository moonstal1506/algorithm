package dynamic;

import java.util.Scanner;


//2.돌다리 앞문제랑 같은데 돌다리는 다 건너는게 한번 더 가야함
//동적계획법 문제를 가장 작게 만들어 확장된 문제에 씀
public class Ex2 {
	static int[] dy;
	public int solution(int n){
		dy[1]=1;
		dy[2]=2;
		for(int i=3; i<=n+1; i++) dy[i]=dy[i-2]+dy[i-1];
		return dy[n+1];
	}

	public static void main(String[] args){
		Ex2 T = new Ex2();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		dy=new int[n+2];
		System.out.print(T.solution(n));
	}
}