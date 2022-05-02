
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//3. 팩토리얼
public class Ex3 {
	public static int DFS(int n){
		if(n==1) {
			return 1;
		}else {
			return n*DFS(n-1);
		}
	}
	public static void main(String[] args){
		System.out.println(DFS(5));
	}	
}