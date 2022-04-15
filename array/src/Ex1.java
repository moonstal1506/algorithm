
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

//1. 큰 수 출력하기

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> a = new ArrayList<>();
		a.add(arr[0]);
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1]) {
				a.add(arr[i]);
			}
		}
		for (int d : a) {
			System.out.print(d + " ");

		}
	}
}