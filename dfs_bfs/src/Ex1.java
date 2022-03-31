
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//1.재귀함수
//출력을 재귀함수 밑에서 해야 스택에 쌓이면서 1,2,3 찍힘
public class Ex1 {
	public void DFS(int n) {
		if (n == 0)
			return;
		else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		Ex1 T = new Ex1();
		T.DFS(3);
	}
}