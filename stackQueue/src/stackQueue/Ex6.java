package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//6. 공주구하기
//숫자 2개 입력받아넘겨 숫자 리턴
//답 초기화
//큐 생성은 링크드리스트
//1부터 n까지 반복해서 큐에 넣어줌
//비어있지 않을때까지 k앞에꺼 뒤로 넣어주고 제거시킴
//1개남으면 그게 답
public class Ex6 {
	private static int solution(int n,int k) {
		int answer = 0;
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<=n;i++) q.offer(i);
		while(!q.isEmpty()) {
			for(int i=1;i<k;i++) q.offer(q.poll());
			q.poll();
			if(q.size()==1) answer=q.poll();
		}
		
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.print(solution(n,k));
		
	}

}
