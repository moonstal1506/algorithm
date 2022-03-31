
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//3. 팩토리얼
//n고정시켜놓고 재귀로 돌려
public class Ex3 {
	public int DFS(int n){
		if(n==1) return 1;
		else if(n==2) return 1;
		else return DFS(n-2)+DFS(n-1);
	}
	public static void main(String[] args){
		Ex3 T = new Ex3();
		int n=10;
		for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
	}	
}