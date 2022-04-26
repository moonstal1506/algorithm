package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//6. 공주 구하기
public class Ex6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.add(i + 1);
		}
		while (!q.isEmpty()) {
			for (int i = 1; i < k; i++) {
				q.add(q.poll());
			}
			q.poll();
			if(q.size()==1) {
				System.out.println(q.poll());
			}
		}
	}
}
