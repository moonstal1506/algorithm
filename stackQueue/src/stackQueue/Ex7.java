package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//7. 교육과정설계
//필수과목,계획 입력받아 yes/no리턴
//답은 예스로 초기화
//큐생성
//큐에 필수과목 담아
//계획을 반복문 돌리면서 큐에 포함되어있으면 큐꺼내서 계획과 비교 다르면 노 리턴
//반복끝 큐가 비어있지 않으면 노 리턴
public class Ex7 {
	private static String solution(String need,String plan) {
		String answer = "YES";
		Queue<Character> q=new LinkedList<>();
		for(char x: need.toCharArray()) q.offer(x);
		for(char x: plan.toCharArray()) {
			if(q.contains(x)) {
				if(q.poll()!=x) return "NO";
			}
		}
		if(!q.isEmpty()) return "NO";
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String need = kb.next();
		String plan = kb.next();
		System.out.print(solution(need,plan));
		
	}

}
