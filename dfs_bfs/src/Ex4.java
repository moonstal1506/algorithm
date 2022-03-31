
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//4.피보나치 재귀
//2번쨰 앞에 것과 바로 앞의 값을 더해 출력
//트리 그려보면 알 수 있음
public class Ex4 {
//	public int DFS(int n){
//		if(n==1) return 1;
//		else if(n==2) return 1;
//		else return DFS(n-2)+DFS(n-1);
//	}
//	public static void main(String[] args){
//		Ex4 T = new Ex4();
//		int n=10;
//		for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
//	}	
	
	
//	배열에 담하두고 구해놓은것 재활용하기
//	재귀성능 안좋음 스택에 쌓이기 때문
	static int[] fibo;
	public int DFS(int n){
		if(fibo[n]>0) return fibo[n];//0보다 크다는건 이미 구해놨다는 것
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else return fibo[n]=DFS(n-2)+DFS(n-1);
	}
	public static void main(String[] args){
		Ex4 T = new Ex4();
		int n=45;
		fibo=new int[n+1];//1부터 사용할거라
		T.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
	}	
	
}