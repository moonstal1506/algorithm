
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//2.이진수 출력
//11 5 2 1
// 1 1 0 1
//->1011 
public class Ex2 {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n/2);
			System.out.print(n%2);
		}
	}
	public static void main(String[] args){
		Ex2 T = new Ex2();
		T.DFS(11);
	}	
}