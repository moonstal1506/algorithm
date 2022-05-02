
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//1.재귀함수
public class Ex1 {
	
	public static void DFS(int n) {
		if(n==0) {
			return;
		}else {
			DFS(n-1);
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		DFS(3);
		
	}
}